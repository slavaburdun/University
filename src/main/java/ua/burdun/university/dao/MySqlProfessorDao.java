package ua.burdun.university.dao;

import ua.burdun.university.model.Professor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by burdun on 24.09.2014.
 */
public class MySqlProfessorDao implements ProfessorDao {

    private final Connection connection;

    @Override
    public Professor create() {
        return null;
    }

    @Override
    public Professor read(int key) throws SQLException {
        String sql = "SELECT * FROM daotalk.Group WHERE id = ?;";
        PreparedStatement stm = connection.prepareStatement(sql);

        stm.setInt(1, key);

        ResultSet rs = stm.executeQuery();
        rs.next();
        Professor professor = new Professor();
        professor.setId(rs.getInt("id"));
        professor.setName(rs.getString("name"));
        return professor;
    }

    @Override
    public void update(Professor group) {

    }

    @Override
    public void delete(Professor group) {

    }

    @Override
    public List<Professor> getAll() throws SQLException {
        String sql = "SELECT * FROM professor;";
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        List<Professor> list = new ArrayList<Professor>();
        while (rs.next()) {
            Professor professor = new Professor();
            professor.setId(rs.getInt("id"));
            professor.setName(rs.getString("name"));
            list.add(professor);
        }
        return list;
    }

    public MySqlProfessorDao(Connection connection) {
        this.connection = connection;
    }

}
