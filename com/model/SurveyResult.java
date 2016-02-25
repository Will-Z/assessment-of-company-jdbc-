package com.model;

/**
 * Created by Will on 12/31/15.
 */
public class SurveyResult implements java.io.Serializable {
    //field
    /**  **/
    private int projectId;
    /**  **/
    private int corId;
    /**  **/
    private Double grade;

    public SurveyResult() {

    }
    public SurveyResult(int projectId, int corId, Double grade) {
        super();
        this.projectId = projectId;
        this.corId = corId;
        this.grade = grade;
    }
    public int getProjectId() {
        return projectId;
    }
    public int getCorId() {
        return corId;
    }
    public Double getGrade() {
        return grade;
    }
    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }
    public void setCorId(int corId) {
        this.corId = corId;
    }
    public void setGrade(Double grade) {
        this.grade = grade;
    }
    @Override
    public String toString() {
        return "SurveyResult \nprojectId=" + projectId + ",\n corId="
                + corId + ",\n grade=" + grade;
    }


}