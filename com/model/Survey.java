package com.model;

/**
 * Created by Will on 12/31/15.
 */
public class Survey implements java.io.Serializable {
    //field
    /**  **/
    private int surveyId;
    /**  **/
    private int projectId;
    /**  **/
    private int corId;
    /**  **/
    private String capitalGrade;
    /**  **/
    private String procedureGrade;
    /**  **/
    private String bidGrade;
    /**  **/
    private String orderGrade;
    /**  **/
    private String changeGrade;
    /**  **/
    private String inviteCode;
    /**  **/
    private int status;

    public Survey() {

    }

    public Survey(int surveyId, int projectId, int corId,
                  String capitalGrade, String procedureGrade, String bidGrade,
                  String orderGrade, String changeGrade, String inviteCode,
                  int status) {
        super();
        this.surveyId = surveyId;
        this.projectId = projectId;
        this.corId = corId;
        this.capitalGrade = capitalGrade;
        this.procedureGrade = procedureGrade;
        this.bidGrade = bidGrade;
        this.orderGrade = orderGrade;
        this.changeGrade = changeGrade;
        this.inviteCode = inviteCode;
        this.status = status;
    }
    public int getSurveyId() {
        return surveyId;
    }
    public int getProjectId() {
        return projectId;
    }
    public int getCorId() {
        return corId;
    }
    public String getCapitalGrade() {
        return capitalGrade;
    }
    public String getProcedureGrade() {
        return procedureGrade;
    }
    public String getBidGrade() {
        return bidGrade;
    }
    public String getOrderGrade() {
        return orderGrade;
    }
    public String getChangeGrade() {
        return changeGrade;
    }
    public String getInviteCode() {
        return inviteCode;
    }
    public int getStatus() {
        return status;
    }
    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }
    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }
    public void setCorId(int corId) {
        this.corId = corId;
    }
    public void setCapitalGrade(String capitalGrade) {
        this.capitalGrade = capitalGrade;
    }
    public void setProcedureGrade(String procedureGrade) {
        this.procedureGrade = procedureGrade;
    }
    public void setBidGrade(String bidGrade) {
        this.bidGrade = bidGrade;
    }
    public void setOrderGrade(String orderGrade) {
        this.orderGrade = orderGrade;
    }
    public void setChangeGrade(String changeGrade) {
        this.changeGrade = changeGrade;
    }
    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Survey \nsurveyId=" + surveyId + ",\n projectId="
                + projectId + ",\n corId=" + corId + ",\n capitalGrade="
                + capitalGrade + ",\n procedureGrade=" + procedureGrade
                + ",\n bidGrade=" + bidGrade + ",\n orderGrade="
                + orderGrade + ",\n changeGrade=" + changeGrade
                + ",\n inviteCode=" + inviteCode + ",\n status=" + status;
    }

}