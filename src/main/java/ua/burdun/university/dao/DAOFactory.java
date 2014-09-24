package ua.burdun.university.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by burdun on 24.09.2014.
 */
public interface DaoFactory {

    /** Возвращает подключение к базе данных */
    public Connection getConnection() throws SQLException;

    /** Возвращает объект для управления персистентным состоянием объекта Professor */
    public ProfessorDao getProfessorDao(Connection connection);

    /** Возвращает объект для управления персистентным состоянием объекта Subject */
    public SubjectDao getSubjectDao(Connection connection);

}
