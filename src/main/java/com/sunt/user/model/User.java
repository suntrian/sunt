package com.sunt.user.model;

import com.sunt.project.model.Project;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by suntrian on 17-4-2.
 */
public class User implements Serializable{
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String password;
    private Position position;
    private Department department;
    private int userType;
    private Set<Project> projects;
    private UserInfo userInfo;


    public User(){    }

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }

    public User(String name, String password, Position position, Department department, int userType) {
        this.name = name;
        this.password = password;
        this.position = position;
        this.department = department;
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", position=" + position +
                ", department=" + department +
                ", userType=" + userType +
                '}';
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
