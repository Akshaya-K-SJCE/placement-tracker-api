package com.akshaya.placementtracker;

public class Student {

    private int id;
    private String name;
    private String department;
    private String status;

    // Default Constructor
    public Student() {
    }

    // Parameterized Constructor
    public Student(int id, String name, String department, String status) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.status = status;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}