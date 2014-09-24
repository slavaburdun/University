package ua.burdun.university.model;

/**
 * Created by burdun on 23.09.2014.
 */
public class Subject extends Entity {

    private int id;
    private String name;
    private String day;
    private String audience;
    private int id_Professor;

    public Subject(int id, String name, String day, String audience, int id_Professor) {
        this.id = id;
        this.name = name;
        this.day = day;
        this.audience = audience;
        this.id_Professor = id_Professor;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", day='" + day + '\'' +
                ", audience='" + audience + '\'' +
                ", id_Professor=" + id_Professor +
                '}';
    }
}
