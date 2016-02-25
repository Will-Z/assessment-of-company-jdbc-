package com.action;

import com.dao.ProjectDao;
import java.util.*;
import com.model.Project;

/**
 * Created by Will on 1/1/16.
 */
public class ProjectAction {
    public static void main(String[] args) throws Exception {
        ProjectDao p = new ProjectDao();
        Project p1 = new Project();
/*
        p1.setProjectName("000");
        p1.setProjectInfo("information");
        p1.setSurveyTotalNum(100);
        p1.setSurveyFinishedNum(90);
        p1.setIsGeneratedSurvey(1);
        p1.setProjectId(1);

        p.delProject((2));

*/
        List<Project> rs = p.query(1);
        for(int i = 0; i < rs.size(); i++) {
            System.out.println(rs.get(i).toString());
        }


    }
}
