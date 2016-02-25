package com.model;

/**
 * Created by Will on 12/31/15.
 */
public class Project implements java.io.Serializable {
    //field
    /**  **/
    private int projectId;
    /**  **/
    private String projectName;
    /**  **/
    private String projectInfo;
    /**  **/
    private int surveyTotalNum;
    /**  **/
    private int surveyFinishedNum;
    /**  **/
    private int isGeneratedSurvey;

    public Project () {

    }
    public Project(int projectId, String projectName, String projectInfo,
                   int surveyTotalNum, int surveyFinishedNum,
                   int isGeneratedSurvey) {
        super();
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectInfo = projectInfo;
        this.surveyTotalNum = surveyTotalNum;
        this.surveyFinishedNum = surveyFinishedNum;
        this.isGeneratedSurvey = isGeneratedSurvey;
    }
    public int getProjectId() {
        return projectId;
    }
    public String getProjectName() {
        return projectName;
    }
    public String getProjectInfo() {
        return projectInfo;
    }
    public int getSurveyTotalNum() {
        return surveyTotalNum;
    }
    public int getSurveyFinishedNum() {
        return surveyFinishedNum;
    }
    public int getIsGeneratedSurvey() {
        return isGeneratedSurvey;
    }
    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public void setProjectInfo(String projectInfo) {
        this.projectInfo = projectInfo;
    }
    public void setSurveyTotalNum(int surveyTotalNum) {
        this.surveyTotalNum = surveyTotalNum;
    }
    public void setSurveyFinishedNum(int surveyFinishedNum) {
        this.surveyFinishedNum = surveyFinishedNum;
    }
    public void setIsGeneratedSurvey(int isGeneratedSurvey) {
        this.isGeneratedSurvey = isGeneratedSurvey;
    }
    @Override
    public String toString() {
        return "Project \nprojectId=" + projectId + ",\n projectName="
                + projectName + ",\n projectInfo=" + projectInfo
                + ",\n surveyTotalNum=" + surveyTotalNum
                + ",\n surveyFinishedNum=" + surveyFinishedNum
                + ",\n isGeneratedSurvey=" + isGeneratedSurvey;
    }


}