package ua.burdun.university;

/**
 * Created by burdun on 23.09.2014.
 */
public class Professor {

    private int id;
    private String name;

    public Professor(int id, String name) {
        this.id = id;
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
