package com.sunt.project.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by suntrian on 17-4-2.
 */
public class ProjectMileStone implements Serializable {
    private static final long serialVersionUID = 1L;
    private enum MilestoneStatus{
        UNREACH, OVERREACH, FINISHED;
    }
    private int id;
    private String name;
    private Project project;
    private Date planDate;
    private String goal;            //里程碑目标
    private String description;
    private int status;             //里程碑状态,未到时,已延期,已完成

}
