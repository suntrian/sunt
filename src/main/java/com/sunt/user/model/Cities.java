package com.sunt.user.model;

import java.io.Serializable;

/**
 * Created by suntrian on 17-4-2.
 */

public class Cities implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private int upper;
    private int level;

    public Cities(){}

    public Cities(int id, String name, int upper, int level) {
        this.id = id;
        this.name = name;
        this.upper = upper;
        this.level = level;
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

    public int getUpper() {
        return upper;
    }

    public void setUpper(int upper) {
        this.upper = upper;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    @Override
    public String toString() {
        return "Cities{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", upper=" + upper +
                ", level=" + level +
                '}';
    }
}
