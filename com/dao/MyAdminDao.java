package com.dao;
/**
 * Created by Will on 12/31/15.
 */
import com.db.DBUtil;
import com.model.MyAdmin;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Will on 12/31/15.
 */
public class MyAdminDao {

//All accepted    <by Will>
//----------------------------------------------------------------------------------------------------------
/*Ac*/
    public void addMyAdmin(MyAdmin m)  throws Exception {
        Connection conn = DBUtil.getConnection();

        String sql = "" +
                " insert into myadmin " +
                " (adminId, adminName, password) " +
                " values(?, ?, ?) ";

        PreparedStatement ptmt = conn.prepareStatement(sql);

        ptmt.setInt(1, m.getAdminId());
        ptmt.setString(2, m.getAdminName());
        ptmt.setString(3, m.getPassword());
        ptmt.execute();
    }

//----------------------------------------------------------------------------------------------------------
// "adminId" is the keyword to update
/*Ac*/
    public void updateMyAdmin(MyAdmin m) throws SQLException {
        Connection conn = DBUtil.getConnection();

        String sql = "" +
                " update myadmin " +
                " set adminName=?, password=? " +
                " where adminId=? ";

        PreparedStatement ptmt =conn.prepareStatement(sql);

        ptmt.setString(1, m.getAdminName());
        ptmt.setString(2, m.getPassword());
        ptmt.setInt(3, m.getAdminId());
        ptmt.execute();
    }

//----------------------------------------------------------------------------------------------------------
// "adminId" is the keyword to delete
/*Ac*/
    public void delMyAdmin(Integer adminId) throws SQLException {
        Connection conn = DBUtil.getConnection();

        String sql="" +
                " delete from myadmin " +
                " where adminId=?";

        PreparedStatement ptmt = conn.prepareStatement(sql);
        ptmt.setInt(1, adminId);
        ptmt.execute();
    }

//----------------------------------------------------------------------------------------------------------
// "adminId" is the keyword to query
/*Ac*/
    public List<MyAdmin> query(Integer adminId) throws Exception {
        List<MyAdmin> result = new ArrayList<MyAdmin>();

        Connection conn = DBUtil.getConnection();
        StringBuilder sb = new StringBuilder();
        sb.append(" select * from myadmin ");
        sb.append(" where adminId=? ");

        PreparedStatement ptmt = conn.prepareStatement(sb.toString());
        ptmt.setInt(1, adminId);
        ResultSet rs = ptmt.executeQuery();

        MyAdmin m = null;
        while(rs.next()) {
            m = new MyAdmin();
            m.setAdminId(rs.getInt("adminId"));
            m.setAdminName(rs.getString("adminName"));
            m.setPassword(rs.getString("password"));
            result.add(m);
        }
        return result;
    }

}
