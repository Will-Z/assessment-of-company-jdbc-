package com.dao;

import com.db.DBUtil;
import com.model.Project;
import com.model.Survey;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Will on 1/1/16.
 */


//All accepted    <by Will>
public class SurveyDao {
//----------------------------------------------------------------------------------------------------------
/*Ac*/
    public void addSurvey(Survey s)  throws Exception {
        Connection conn = DBUtil.getConnection();

        String sql = "" +
                " insert into survey " +
                " ( projectId, corId, capitalGrade, procedureGrade, bidGrade, " +
                " orderGrade, changeGrade, inviteCode, status) " +
                " values(?, ?, ?, ?, ?, ?, ?, ?, ?) ";

        PreparedStatement ptmt = conn.prepareStatement(sql);

        ptmt.setInt(1, s.getProjectId());
        ptmt.setInt(2, s.getCorId());
        ptmt.setString(3, s.getCapitalGrade());
        ptmt.setString(4, s.getProcedureGrade());
        ptmt.setString(5, s.getBidGrade());
        ptmt.setString(6, s.getOrderGrade());
        ptmt.setString(7, s.getChangeGrade());
        ptmt.setString(8, s.getInviteCode());
        ptmt.setInt(9, s.getStatus());
        ptmt.execute();
    }

//----------------------------------------------------------------------------------------------------------
// "surveyId" is the keyword to update
/*Ac*/
    public void updateSurvey(Survey s) throws SQLException {
        Connection conn = DBUtil.getConnection();

        String sql = "" +
                " update survey " +
                " set projectId=?, corId=?, capitalGrade=?, procedureGrade=?, bidGrade=?, " +
                "  orderGrade=?, changeGrade=?, inviteCode=?, status=? " +
                " where surveyId=? ";

        PreparedStatement ptmt =conn.prepareStatement(sql);

        ptmt.setInt(1, s.getProjectId());
        ptmt.setInt(2, s.getCorId());
        ptmt.setString(3, s.getCapitalGrade());
        ptmt.setString(4, s.getProcedureGrade());
        ptmt.setString(5, s.getBidGrade());
        ptmt.setString(6, s.getOrderGrade());
        ptmt.setString(7, s.getChangeGrade());
        ptmt.setString(8, s.getInviteCode());
        ptmt.setInt(9, s.getStatus());
        ptmt.setInt(10, s.getSurveyId());
        ptmt.execute();
    }

//----------------------------------------------------------------------------------------------------------
// "surveyId" is the keyword to delete
/*Ac*/
    public void delSurvey(Integer surveyId) throws SQLException {
        Connection conn = DBUtil.getConnection();

        String sql="" +
                " delete from survey " +
                " where surveyId=?";

        PreparedStatement ptmt = conn.prepareStatement(sql);
        ptmt.setInt(1, surveyId);
        ptmt.execute();
    }

//----------------------------------------------------------------------------------------------------------
// "surveyId" is the keyword to query
/*Ac*/
    public List<Survey> querySurveyId(Integer surveyId) throws Exception {
        List<Survey> result = new ArrayList<Survey>();

        Connection conn = DBUtil.getConnection();
        StringBuilder sb = new StringBuilder();
        sb.append(" select * from survey ");
        sb.append(" where surveyId=? ");

        PreparedStatement ptmt = conn.prepareStatement(sb.toString());
        ptmt.setInt(1, surveyId);
        ResultSet rs = ptmt.executeQuery();

        Survey s = null;
        while(rs.next()) {
            s = new Survey();
            s.setSurveyId(rs.getInt("surveyId"));
            s.setProjectId(rs.getInt("projectId"));
            s.setCorId(rs.getInt("corId"));
            s.setCapitalGrade(rs.getString("capitalGrade"));
            s.setProcedureGrade(rs.getString("procedureGrade"));
            s.setBidGrade(rs.getString("bidGrade"));
            s.setOrderGrade(rs.getString("orderGrade"));
            s.setChangeGrade(rs.getString("changeGrade"));
            s.setInviteCode(rs.getString("inviteCode"));
            s.setStatus(rs.getInt("status"));
            result.add(s);
        }
        return result;
    }

//----------------------------------------------------------------------------------------------------------
// "projectId" is the keyword to query
/*Ac*/
    public List<Survey> queryProjectId(Integer projectId) throws Exception {
        List<Survey> result = new ArrayList<Survey>();

        Connection conn = DBUtil.getConnection();
        StringBuilder sb = new StringBuilder();
        sb.append(" select * from survey ");
        sb.append(" where projectId=? ");

        PreparedStatement ptmt = conn.prepareStatement(sb.toString());
        ptmt.setInt(1, projectId);
        ResultSet rs = ptmt.executeQuery();

        Survey s = null;
        while(rs.next()) {
            s = new Survey();
            s.setSurveyId(rs.getInt("surveyId"));
            s.setProjectId(rs.getInt("projectId"));
            s.setCorId(rs.getInt("corId"));
            s.setCapitalGrade(rs.getString("capitalGrade"));
            s.setProcedureGrade(rs.getString("procedureGrade"));
            s.setBidGrade(rs.getString("bidGrade"));
            s.setOrderGrade(rs.getString("orderGrade"));
            s.setChangeGrade(rs.getString("changeGrade"));
            s.setInviteCode(rs.getString("inviteCode"));
            s.setStatus(rs.getInt("status"));
            result.add(s);
        }
        return result;
    }

}
