package com.model;

/**
 * Created by Will on 1/1/16.
 */
public class ProjectCor {

    private int projectId;
    private int corId;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getCorId() {
        return corId;
    }

    public void setCorId(int corId) {
        this.corId = corId;
    }

    public String toString() {
        return "ProjectCor \n projectID=" + projectId
                + ",\n corId=" + corId;
    }

}
