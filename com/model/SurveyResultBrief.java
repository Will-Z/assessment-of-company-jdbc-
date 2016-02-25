package com.model;

/**
 * Created by Will on 1/1/16.
 */
public class SurveyResultBrief implements java.io.Serializable {
    private int projectId;
    private String projectName;
    private String corName;
    public SurveyResultBrief() {
    }
    public SurveyResultBrief(int projectId, String projectName, String corName) {
        super();
        this.projectId = projectId;
        this.projectName = projectName;
        this.corName = corName;
    }
    public int getProjectId() {
        return projectId;
    }
    public String getProjectName() {
        return projectName;
    }
    public String getCorName() {
        return corName;
    }
    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public void setCorName(String corName) {
        this.corName = corName;
    }
    @Override
    public String toString() {
        return "SurveyResultBrief \nprojectID=" + projectId
                + ",\n projectName=" + projectName + ",\n corName=" + corName;
    }


}