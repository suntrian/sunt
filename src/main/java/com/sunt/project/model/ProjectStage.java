package com.sunt.project.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by suntrian on 17-4-2.
 */
public class ProjectStage implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private Date planStartDate;
    private Date planFinishDate;
    private int Status;
    private Project project;
    private ProjectMileStone milestone;
    private String description;
}
