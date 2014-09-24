package ua.burdun.university.dao;

import ua.burdun.university.model.Professor;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by burdun on 24.09.2014.
 */
public interface ProfessorDao {

    /** Создает новую запись и соответствующий ей объект */
    public Professor create();

    /** Возвращает объект соответствующий записи с первичным ключом key или null */
    public Professor read(int key) throws SQLException;

    /** Сохраняет состояние объекта group в базе данных */
    public void update(Professor group);

    /** Удаляет запись об объекте из базы данных */
    public void delete(Professor group);

    /** Возвращает список объектов соответствующих всем записям в базе данных */
    public List<Professor> getAll() throws SQLException;

}
