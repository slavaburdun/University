package ua.burdun.university;

import ua.burdun.university.model.Professor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by burdun on 24.09.2014.
 */
public class DataBaseHelper {
    private final static String SQL_INSERT =
            "INSERT INTO professor(id, name) VALUES(?,?)";
    private Connection connect;
    public DataBaseHelper() throws SQLException {
        connect = ConnectorDB.getConnection();
    }
    public PreparedStatement getPreparedStatement(){
        PreparedStatement ps = null;
        try {
            ps = connect.prepareStatement(SQL_INSERT);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ps;
    }
    public boolean insertProfessor(PreparedStatement ps, Professor ab) {
        boolean flag = false;
        try {
            ps.setInt(1, ab.getId());
            ps.setString(2, ab.getName());
            ps.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }
    public void closeStatement(PreparedStatement ps) {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}