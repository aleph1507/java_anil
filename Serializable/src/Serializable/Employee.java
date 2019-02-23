package Serializable;

import java.io.Serializable;

public class Employee implements Serializable {

    private int id;
    private String name;

    private transient int age;

    private int salary;

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id=" + this.id + " name=" + this.name + " age=" + this.age + " salary=" + this.salary;
    }
}
