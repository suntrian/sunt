package com.sunt.project.model;

import com.sunt.user.model.User;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by suntrian on 17-4-2.
 * 项目包含成员及成员在项目中角色
 */
public class ProjectUsers implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private Project project;
    private User member;
    private Set<ProjectRole> roles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public User getMember() {
        return member;
    }

    public void setMember(User member) {
        this.member = member;
    }

    public Set<ProjectRole> getRoles() {
        return roles;
    }

    public void setRoles(Set<ProjectRole> roles) {
        this.roles = roles;
    }
}
