package com.db;

/**
 * Created by Will on 12/31/15.
 */

import java.sql.*;

public class DBUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/bid";
    private static final String USER = "root";
    private static final String PASSWORD = "111111";


    private static Connection conn = null;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static  Connection getConnection() {
        return conn;

    }



/*

    public static void main(String[] args) throws Exception {
        //1.加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取数据库的连接
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        //3.通过数据库的连接操作数据库, 实现增删改查
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select corId, corName from corperation");
        while(rs.next()) {
            System.out.println(rs.getInt("corId")+","+rs.getString("CorName"));
        }
    }

*/
}
