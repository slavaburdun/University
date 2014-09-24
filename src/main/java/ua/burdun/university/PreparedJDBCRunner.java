package ua.burdun.university;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by burdun on 24.09.2014.
 */
public class PreparedJDBCRunner {
    public static void main(String[] args) {
        ArrayList<Professor> list = new ArrayList<Professor>() {
            {
                add(new Professor(3, "Gomonay"));
                add(new Professor(4, "Savchuk"));
            }
        };
        DataBaseHelper helper = null;
        PreparedStatement statement = null;
        try {
            helper = new DataBaseHelper();
            statement = helper.getPreparedStatement();
            for (Professor professor : list) {
                helper.insertProfessor(statement, professor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            helper.closeStatement(statement);
        }
    }
}