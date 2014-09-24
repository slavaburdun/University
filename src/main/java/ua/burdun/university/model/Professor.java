package ua.burdun.university.model;

/**
 * Created by burdun on 23.09.2014.
 */
public class Professor extends Entity {

    private int id;
    private String name;

    public Professor() {
    }

    public Professor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
