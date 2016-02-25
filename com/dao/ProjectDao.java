package com.dao;

import com.db.DBUtil;
import com.model.MyAdmin;
import com.model.Project;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Will on 12/31/15.
 */


//All accepted     <by Will>
public class ProjectDao {

//----------------------------------------------------------------------------------------------------------
/*Ac*/
    public void addProjcet(Project p)  throws Exception {
        Connection conn = DBUtil.getConnection();

        String sql = "" +
                " insert into project " +
                " (projectName, projectInfo, surveyTotalNum, " +
                " surveyFinishedNum, isGeneratedSurvey) " +
                " values(?, ?, ?, ?, ?) ";

        PreparedStatement ptmt = conn.prepareStatement(sql);

        ptmt.setString(1, p.getProjectName());
        ptmt.setString(2, p.getProjectInfo());
        ptmt.setInt(3, p.getSurveyTotalNum());
        ptmt.setInt(4, p.getSurveyFinishedNum());
        ptmt.setInt(5, p.getIsGeneratedSurvey());
        ptmt.execute();
    }

//----------------------------------------------------------------------------------------------------------
// "projectId" is the keyword to update
/*Ac*/
    public void updateProject(Project p) throws SQLException {
        Connection conn = DBUtil.getConnection();

        String sql = "" +
                " update project " +
                " set projectName=?, projectInfo=?, surveyTotalNum=?, " +
                " surveyFinishedNum=?, isGeneratedSurvey=? " +
                " where projectId=? ";

        PreparedStatement ptmt =conn.prepareStatement(sql);

        ptmt.setString(1, p.getProjectName());
        ptmt.setString(2, p.getProjectInfo());
        ptmt.setInt(3, p.getSurveyTotalNum());
        ptmt.setInt(4, p.getSurveyFinishedNum());
        ptmt.setInt(5, p.getIsGeneratedSurvey());
        ptmt.setInt(6, p.getProjectId());
        ptmt.execute();
    }

//----------------------------------------------------------------------------------------------------------
// "projectId" is the keyword to delete
/*Ac*/
    public void delProject(Integer projectId) throws SQLException {
        Connection conn = DBUtil.getConnection();

        String sql="" +
                " delete from project " +
                " where projectId=?";

        PreparedStatement ptmt = conn.prepareStatement(sql);
        ptmt.setInt(1, projectId);
        ptmt.execute();
    }

//----------------------------------------------------------------------------------------------------------
// "projectId" is the keyword to query
/*Ac*/
    public List<Project> query(Integer projectId) throws Exception {
        List<Project> result = new ArrayList<Project>();

        Connection conn = DBUtil.getConnection();
        StringBuilder sb = new StringBuilder();
        sb.append(" select * from project ");
        sb.append(" where projectId=? ");

        PreparedStatement ptmt = conn.prepareStatement(sb.toString());
        ptmt.setInt(1, projectId);
        ResultSet rs = ptmt.executeQuery();

        Project p = null;
        while(rs.next()) {
            p = new Project();
            p.setProjectId(rs.getInt("projectId"));
            p.setProjectName(rs.getString("ProjectName"));
            p.setProjectInfo(rs.getString("projectInfo"));
            p.setSurveyTotalNum(rs.getInt("surveyTotalNum"));
            p.setSurveyFinishedNum(rs.getInt("surveyFinishedNum"));
            p.setIsGeneratedSurvey(rs.getInt("isGeneratedSurvey"));
            result.add(p);
        }
        return result;
    }


}
