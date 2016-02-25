package com.dao;

import com.db.DBUtil;
import com.model.ProjectCor;
import com.model.SurveyResult;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Will on 1/1/16.
 */

//All accepted    <by Will>
public class ProjectCorDao {

//----------------------------------------------------------------------------------------------------------
/*Ac*/
    public void addProjectCorDao(ProjectCor p)  throws Exception {
        Connection conn = DBUtil.getConnection();

        String sql = "" +
                " insert into project_cor " +
                " (projectId, corId) " +
                " values(?, ?) ";

        PreparedStatement ptmt = conn.prepareStatement(sql);

        ptmt.setInt(1, p.getProjectId());
        ptmt.setInt(2, p.getCorId());
        ptmt.execute();
    }

//----------------------------------------------------------------------------------------------------------
// "projectId" is the keyword to update
/*Ac*/
    public void updateProjectCorDao(ProjectCor p) throws SQLException {
        Connection conn = DBUtil.getConnection();

        String sql = "" +
                " update project_cor " +
                " set corId=? " +
                " where projectId=? ";

        PreparedStatement ptmt =conn.prepareStatement(sql);

        ptmt.setInt(1, p.getCorId());
        ptmt.setInt(2, p.getProjectId());
        ptmt.execute();
    }

//---------------------------------------------------------------------------------------------------------
// "projectId" is  the keyword  to delete
/*Ac*/
    public void delProjectCorDao(Integer projectId) throws SQLException {
        Connection conn = DBUtil.getConnection();

        String sql="" +
                " delete from project_cor " +
                " where projectId=? ";

        PreparedStatement ptmt = conn.prepareStatement(sql);
        ptmt.setInt(1, projectId);
        ptmt.execute();
    }

//----------------------------------------------------------------------------------------------------------
// "projectId"is the keyword to query
/*Ac*/
    public List<ProjectCor> query(Integer projectId) throws Exception {
        List<ProjectCor> result = new ArrayList<ProjectCor>();

        Connection conn = DBUtil.getConnection();
        StringBuilder sb = new StringBuilder();
        sb.append(" select * from project_cor ");
        sb.append(" where projectId=? ");

        PreparedStatement ptmt = conn.prepareStatement(sb.toString());
        ptmt.setInt(1, projectId);
        ResultSet rs = ptmt.executeQuery();

        ProjectCor p = null;
        while(rs.next()) {
            p = new ProjectCor();
            p.setProjectId(rs.getInt("ProjectId"));
            p.setCorId(rs.getInt("corId"));
            result.add(p);
        }
        return result;
    }


}
