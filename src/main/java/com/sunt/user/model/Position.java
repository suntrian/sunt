package com.sunt.user.model;

import java.io.Serializable;

/**
 * Created by suntrian on 17-4-2.
 */
public class Position implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private Department department;
    private String duty;

    public Position(){}

    public Position(int id, String name, Department department, String duty) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.duty = duty;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department=" + department +
                ", duty='" + duty + '\'' +
                '}';
    }
}
