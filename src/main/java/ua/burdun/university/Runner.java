package ua.burdun.university;

import ua.burdun.university.dao.DaoFactory;
import ua.burdun.university.dao.MySqlDaoFactory;
import ua.burdun.university.dao.ProfessorDao;
import ua.burdun.university.model.Professor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by burdun on 24.09.2014.
 */
public class Runner {

    public static void main(String[] args) {
        DaoFactory daoFactory = new MySqlDaoFactory();
        List<Professor> list;
        try (Connection con = daoFactory.getConnection()) {
            ProfessorDao dao = daoFactory.getProfessorDao(con);
            list = dao.getAll();
            if (list.size() > 0) {
                System.out.println(list);
            } else {
                System.out.println("Not found");
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }

    }
}
