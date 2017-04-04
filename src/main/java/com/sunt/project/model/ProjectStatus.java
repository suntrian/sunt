package com.sunt.project.model;

import java.io.Serializable;

/**
 * Created by suntrian on 17-4-2.
 */
public class ProjectStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private boolean defaultChoosen;

    public ProjectStatus(){}
    public ProjectStatus(String name, boolean defaultChoosen) {
        this.name = name;
        this.defaultChoosen = defaultChoosen;
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

    public boolean isDefaultChoosen() {
        return defaultChoosen;
    }

    public void setDefaultChoosen(boolean defaultChoosen) {
        this.defaultChoosen = defaultChoosen;
    }
}
