package com.action;

import com.dao.MyAdminDao;

import com.model.MyAdmin;

import java.util.List;

/**
 * Created by Will on 1/1/16.
 */
public class MyAdminAction {
    public static void main(String[] args) throws Exception {
        MyAdminDao m = new MyAdminDao();
        MyAdmin m1 = new MyAdmin();
/*
        m1.setAdminId(2);
        m1.setAdminName("test");
        m1.setPassword("111");

        m.delMyAdmin(1);

*/
        List<MyAdmin> rs = m.query(2);
        for(int i = 0; i < rs.size(); i++) {
            System.out.println(rs.get(i).toString());
        }

    }
}
