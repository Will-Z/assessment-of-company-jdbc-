package com.action;

import com.dao.SurveyResultBriefDao;
import com.model.ProjectCor;
import com.model.SurveyResultBrief;

import java.util.*;


/**
 * Created by Will on 1/1/16.
 */
public class SurveyResultBrieAction {
    public static void main(String[] args) throws Exception {
        SurveyResultBriefDao s = new SurveyResultBriefDao();
        SurveyResultBrief s1 = new SurveyResultBrief();
/*
        s1.setProjectId(2);
        s1.setCorName("111111");
        s1.setProjectName("pr");

        //s.updateSurveyResultBrief(s1);
        s.delSurveyResultBrief(1);

*/

        List<SurveyResultBrief> rs = s.query(2);
        for(int i = 0; i < rs.size(); i++) {
            System.out.println(rs.get(i).toString());
        }


    }
}
