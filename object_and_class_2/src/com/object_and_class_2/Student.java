package com.object_and_class_2;

class Student {
    private int id;
    private String name;
    private static String college = "PU";

    public String getCollege() {
        return this.college;
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


    Student() {

    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
