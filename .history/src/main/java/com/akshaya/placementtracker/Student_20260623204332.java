package com.akshaya.placementtracker;

public class Student {

    private int id;
    private String name;
    private String department;
    private String status;

    public Student(int id, String name, String department, String status) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getStatus() {
        return status;
    }
}