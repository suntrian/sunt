package com.sunt.project.model;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by suntrian on 17-4-2.
 */
public class ProjectType implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private boolean defaultChoosen;
    private int columns;            //项目类型关联项目包含的字段
    private int extColumns;         //项目类型关联额外的字段
    private String description;
    private Set<ProjectRole> projectRoles; //项目类型包含的角色

    public ProjectType(){}

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

    public boolean isDefaultChoosen() {
        return defaultChoosen;
    }

    public void setDefaultChoosen(boolean defaultChoosen) {
        this.defaultChoosen = defaultChoosen;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getExtColumns() {
        return extColumns;
    }

    public void setExtColumns(int extColumns) {
        this.extColumns = extColumns;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<ProjectRole> getProjectRoles() {
        return projectRoles;
    }

    public void setProjectRoles(Set<ProjectRole> projectRoles) {
        this.projectRoles = projectRoles;
    }
}
