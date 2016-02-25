package com.action;

import com.dao.ProjectCorDao;
import java.util.*;
import com.model.Project;
import com.model.ProjectCor;

/**
 * Created by Will on 1/1/16.
 */
public class ProjectCorAction {
    public static void main(String[] args)  throws Exception{
        ProjectCorDao p = new ProjectCorDao();
        ProjectCor p1 = new ProjectCor();
/*
        p1.setProjectId(2);
        p1.setCorId(333);

       // p.updateProjectCorDao(p1);
        p.delProjectCorDao(1);
*/
        List<ProjectCor> rs = p.query(2);
        for(int i = 0; i < rs.size(); i++) {
            System.out.println(rs.get(i).toString());
        }

    }
}
