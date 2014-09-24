package ua.burdun.university.dao;

import ua.burdun.university.model.Subject;

import java.util.List;

/**
 * Created by burdun on 24.09.2014.
 */
public interface SubjectDao {

    /* Создает новую запись и соответствующий ей объект */
    public Subject create();

    /** Возвращает объект соответствующий записи с первичным ключом key или null */
    public Subject read(int key);

    /** Сохраняет состояние объекта group в базе данных */
    public void update(Subject student);

    /** Удаляет запись об объекте из базы данных */
    public void delete(Subject student);

    /** Возвращает список объектов соответствующих всем записям в базе данных */
    public List<Subject> getAll();
}
