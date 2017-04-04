package com.sunt.project.model;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by suntrian on 17-4-2.
 */
public class ProjectRole implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private Project project;
    private String description;
    private Set<ProjectType> projectTypes;      //角色相关的项目类型

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

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<ProjectType> getProjectTypes() {
        return projectTypes;
    }

    public void setProjectTypes(Set<ProjectType> projectTypes) {
        this.projectTypes = projectTypes;
    }

}
