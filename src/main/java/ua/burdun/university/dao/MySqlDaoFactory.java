package ua.burdun.university.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by burdun on 24.09.2014.
 */
public class MySqlDaoFactory implements DaoFactory {

    private String user = "root";//Логин пользователя
    private String password = "";//Пароль пользователя
    private String url = "jdbc:mysql://localhost:3306/university";//URL адрес
    private String driver = "com.mysql.jdbc.Driver";//Имя драйвера

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    @Override
    public ProfessorDao getProfessorDao(Connection connection) {
        return new MySqlProfessorDao(connection);
    }

    @Override
    public SubjectDao getSubjectDao(Connection connection) {
        return null;
    }

    public MySqlDaoFactory() {
        try {
            Class.forName(driver);//Регистрируем драйвер
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
