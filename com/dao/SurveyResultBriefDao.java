package com.dao;

import com.db.DBUtil;
import com.model.SurveyResult;
import com.model.SurveyResultBrief;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Will on 1/1/16.
 */
public class SurveyResultBriefDao {

//----------------------------------------------------------------------------------------------------------
/*Ac*/
    public void addSurveyResultBrief(SurveyResultBrief s)  throws Exception {
        Connection conn = DBUtil.getConnection();

        String sql = "" +
                " insert into survey_result_brief " +
                " (projectID, projectName, corName) " +
                " values(?, ?, ?) ";

        PreparedStatement ptmt = conn.prepareStatement(sql);

        ptmt.setInt(1, s.getProjectId());
        ptmt.setString(2, s.getProjectName());
        ptmt.setString(3, s.getCorName());
        ptmt.execute();
    }

//----------------------------------------------------------------------------------------------------------
// "projectID" is the keyword to update
/*Ac*/
    public void updateSurveyResultBrief(SurveyResultBrief s) throws SQLException {
        Connection conn = DBUtil.getConnection();

        String sql = "" +
                " update survey_result_brief " +
                " set projectName=?, corName=? " +
                " where projectID=? ";

        PreparedStatement ptmt =conn.prepareStatement(sql);

        ptmt.setString(1, s.getProjectName());
        ptmt.setString(2, s.getCorName());
        ptmt.setInt(3, s.getProjectId());
        ptmt.execute();
    }

//---------------------------------------------------------------------------------------------------------
// "projectId" is the keyword to delete
/*Ac*/
    public void delSurveyResultBrief(Integer projectId) throws SQLException {
        Connection conn = DBUtil.getConnection();

        String sql="" +
                " delete from survey_result_brief " +
                " where projectID=? ";

        PreparedStatement ptmt = conn.prepareStatement(sql);
        ptmt.setInt(1, projectId);
        ptmt.execute();
    }

//----------------------------------------------------------------------------------------------------------
// "projectID" is the keyword to query
    public List<SurveyResultBrief> query(Integer projectID) throws Exception {
        List<SurveyResultBrief> result = new ArrayList<SurveyResultBrief>();

        Connection conn = DBUtil.getConnection();
        StringBuilder sb = new StringBuilder();
        sb.append(" select * from survey_result_brief ");
        sb.append(" where projectID=? ");

        PreparedStatement ptmt = conn.prepareStatement(sb.toString());
        ptmt.setInt(1, projectID);
        ResultSet rs = ptmt.executeQuery();

        SurveyResultBrief s = null;
        while(rs.next()) {
            s = new SurveyResultBrief();
            s.setProjectId(rs.getInt("ProjectID"));
            s.setProjectName(rs.getString("projectName"));
            s.setCorName(rs.getString("corName"));
            result.add(s);
        }
        return result;
    }

}
