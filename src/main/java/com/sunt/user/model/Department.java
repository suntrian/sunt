package com.sunt.user.model;

import com.sunt.project.model.Project;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Created by suntrian on 17-4-2.
 */
public class Department implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String description;
    private Department upper;
    private Set<User> users;
    private Set<Position> positions;
    private Set<Project> projects;

    public Department(){}

    public Department(int id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Department(int id, String name, String description, Department upper) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.upper = upper;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Department getUpper() {
        return upper;
    }

    public void setUpper(Department upper) {
        this.upper = upper;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<Position> getPositions() {
        return positions;
    }

    public void setPositions(Set<Position> positions) {
        this.positions = positions;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", upper=" + upper +
                '}';
    }
}
