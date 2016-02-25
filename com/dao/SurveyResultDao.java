package com.dao;

import com.db.DBUtil;
import com.model.MyAdmin;
import com.model.SurveyResult;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Will on 1/1/16.
 */


//All accepted    <by Will>
public class SurveyResultDao {

//----------------------------------------------------------------------------------------------------------
/*Ac*/
    public void addSurveyResult(SurveyResult s)  throws Exception {
        Connection conn = DBUtil.getConnection();

        String sql = "" +
                " insert into survey_result " +
                " (projectId, corId, grade) " +
                " values(?, ?, ?) ";

        PreparedStatement ptmt = conn.prepareStatement(sql);

        ptmt.setInt(1, s.getProjectId());
        ptmt.setInt(2, s.getCorId());
        ptmt.setDouble(3, s.getGrade());
        ptmt.execute();
    }

//----------------------------------------------------------------------------------------------------------
// "projectId" and "corId" are the keywords to update
/*Ac*/
    public void updateSurveyResult(SurveyResult s) throws SQLException {
        Connection conn = DBUtil.getConnection();

        String sql = "" +
                " update survey_result " +
                " set grade=? " +
                " where projectId=?  and corId=? ";

        PreparedStatement ptmt =conn.prepareStatement(sql);

        ptmt.setDouble(1, s.getGrade());
        ptmt.setInt(2, s.getProjectId());
        ptmt.setInt(3, s.getCorId());
        ptmt.execute();
    }

//---------------------------------------------------------------------------------------------------------
// "projectId" and "corId" are the keywords to delete
/*Ac*/
    public void delSurveyResult(Integer projectId, Integer corId) throws SQLException {
        Connection conn = DBUtil.getConnection();

        String sql="" +
                " delete from survey_result " +
                " where projectId=? and corId=? ";

        PreparedStatement ptmt = conn.prepareStatement(sql);
        ptmt.setInt(1, projectId);
        ptmt.setInt(2, corId);
        ptmt.execute();
    }

//----------------------------------------------------------------------------------------------------------
// "projectId" and "corId" are the keywords to query
/*Ac*/
    public List<SurveyResult> query(Integer projectId, Integer corId) throws Exception {
        List<SurveyResult> result = new ArrayList<SurveyResult>();

        Connection conn = DBUtil.getConnection();
        StringBuilder sb = new StringBuilder();
        sb.append(" select * from survey_result ");
        sb.append(" where projectId=? and corId=? ");

        PreparedStatement ptmt = conn.prepareStatement(sb.toString());
        ptmt.setInt(1, projectId);
        ptmt.setInt(2, corId);
        ResultSet rs = ptmt.executeQuery();

        SurveyResult s = null;
        while(rs.next()) {
            s = new SurveyResult();
            s.setProjectId(rs.getInt("ProjectId"));
            s.setCorId(rs.getInt("corId"));
            s.setGrade(rs.getDouble("grade"));
            result.add(s);
        }
        return result;
    }


}
