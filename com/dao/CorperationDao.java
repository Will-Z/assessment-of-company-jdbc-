package com.dao;

import com.db.DBUtil;
import com.model.Corperation;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Will on 12/31/15.
 */

// All accepted    <by Will>
public class CorperationDao {

//----------------------------------------------------------------------------------------------------------
/*Ac*/
    public void addCorperation(Corperation c) throws Exception {
        Connection conn = DBUtil.getConnection();

        String sql = "" +
                " insert into corperation " +
                " (corName, hasReward, goodRate, reworkLossRate, ontimeRate," +
                " savingRate, casualtyRate, environmentAccidentloss) " +
                " values (" +
                " ?,?,?,?,?,?,?,?)";
        PreparedStatement ptmt = conn.prepareStatement(sql);

        ptmt.setString(1, c.getCorName());
        ptmt.setInt(2, c.getHasReward());
        ptmt.setDouble(3, c.getGoodRate());
        ptmt.setDouble(4, c.getReworkLossrate());
        ptmt.setDouble(5, c.getOntimeRate());
        ptmt.setDouble(6, c.getSavingRate());
        ptmt.setDouble(7, c.getCasualtyRate());
        ptmt.setDouble(8, c.getEnvironmentAccidentloss());

        ptmt.execute();

    }

//----------------------------------------------------------------------------------------------------------
//"corId" is the keyword to update
  /*Ac*/
    public void updateCorperation(Corperation c) throws  SQLException {
        Connection conn = DBUtil.getConnection();

        String sql = "" +
                " update Corperation " +
                " set corName=?, goodRate=?, reworkLossrate=?, ontimeRate=?, " +
                " savingRate=?, casualtyRate=?, environmentAccidentloss=? " +
                " where corId=?";

        PreparedStatement ptmt = conn.prepareStatement(sql);

        ptmt.setString(1, c.getCorName());
        ptmt.setDouble(2, c.getGoodRate());
        ptmt.setDouble(3, c.getReworkLossrate());
        ptmt.setDouble(4, c.getOntimeRate());
        ptmt.setDouble(5, c.getSavingRate());
        ptmt.setDouble(6, c.getCasualtyRate());
        ptmt.setDouble(7, c.getEnvironmentAccidentloss());
        ptmt.setInt(8, c.getCorId());

        ptmt.execute();

    }

//----------------------------------------------------------------------------------------------------------
//"corId" is the keyword to delete
/*Ac*/
    public void delCorperation(Integer id) throws SQLException {
        Connection conn = DBUtil.getConnection();

        String sql = "" +
                " delete from corperation " +
                " where corId =? ";

        PreparedStatement ptmt = conn.prepareStatement(sql);

        ptmt.setInt(1, id);

        ptmt.execute();

    }

//----------------------------------------------------------------------------------------------------------
//show all the corperation with their "corId"  and "corName"
/*Ac*/
    public List<Corperation> query() throws Exception {
        List<Corperation> result = new ArrayList<Corperation>();

        Connection conn = DBUtil.getConnection();
        StringBuilder sb = new StringBuilder();
        sb.append(" select corId, corName from corperation" );

        PreparedStatement ptmt = conn.prepareStatement(sb.toString());
        ResultSet rs = ptmt.executeQuery();
        Corperation c = null;
        while (rs.next()) {
            c = new Corperation();
            c.setCorId(rs.getInt("corId"));
            c.setCorName(rs.getString("corName"));
            result.add(c);
        }
        return result;
    }
//----------------------------------------------------------------------------------------------------------
//"corId" is the keyword to query corperation; and show all the information of this corperation
/*Ac*/
    public List<Corperation> query(Integer corId) throws Exception {
        List<Corperation> result = new ArrayList<Corperation>();

        Connection conn = DBUtil.getConnection();
        StringBuilder sb = new StringBuilder();
        sb.append(" select * from corperation ");
        sb.append("where corId=?");

        PreparedStatement ptmt = conn.prepareStatement(sb.toString());
        ptmt.setInt(1,corId);
        ResultSet rs = ptmt.executeQuery();

        Corperation c = null;
        while (rs.next()) {
            c = new Corperation();
            c.setCorId(rs.getInt("corId"));
            c.setCorName(rs.getString("corName"));
            c.setHasReward(rs.getInt("hasReward"));
            c.setGoodRate(rs.getDouble("goodRate"));
            c.setReworkLossrate(rs.getDouble("reworkLossrate"));
            c.setOntimeRate(rs.getDouble("ontimeRate"));
            c.setSavingRate(rs.getDouble("savingRate"));
            c.setCasualtyRate(rs.getDouble("casualtyRate"));
            c.setEnvironmentAccidentloss(rs.getDouble("environmentAccidentloss"));
            result.add(c);

        }
        return result;

    }


//----------------------------------------------------------------------------------------------------------
//"corName" is the keyword to query corperation; and show all the information of this corperation
/*Ac*/
    public List<Corperation> query(String corName) throws Exception {
        List<Corperation> result = new ArrayList<Corperation>();

        Connection conn = DBUtil.getConnection();
        StringBuilder sb = new StringBuilder();
        sb.append(" select * from corperation ");
        sb.append("where corName=?");

        PreparedStatement ptmt = conn.prepareStatement(sb.toString());
        ptmt.setString(1, corName);
        ResultSet rs = ptmt.executeQuery();

        Corperation c = null;
        while (rs.next()) {
            c = new Corperation();
            c.setCorId(rs.getInt("corId"));
            c.setCorName(rs.getString("corName"));
            c.setHasReward(rs.getInt("hasReward"));
            c.setGoodRate(rs.getDouble("goodRate"));
            c.setReworkLossrate(rs.getDouble("reworkLossrate"));
            c.setOntimeRate(rs.getDouble("ontimeRate"));
            c.setSavingRate(rs.getDouble("savingRate"));
            c.setCasualtyRate(rs.getDouble("casualtyRate"));
            c.setEnvironmentAccidentloss(rs.getDouble("environmentAccidentloss"));
            result.add(c);

        }
        return result;

    }

//----------------------------------------------------------------------------------------------------------


}
