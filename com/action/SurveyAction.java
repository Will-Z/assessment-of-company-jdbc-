package com.action;

import com.dao.SurveyDao;
import com.model.Survey;
import java.util.*;

/**
 * Created by Will on 1/1/16.
 */
public class SurveyAction {
    public static void main(String[] args) throws Exception {
        SurveyDao s = new SurveyDao();
        Survey s1 = new Survey();
/*
        s1.setProjectId(99);
        s1.setCorId(11);
        s1.setCapitalGrade("a");
        s1.setProcedureGrade("a");
        s1.setBidGrade("a");
        s1.setOrderGrade("a");
        s1.setChangeGrade("a");
        s1.setInviteCode("a");
        s1.setStatus(11);
        s1.setSurveyId(1);

       // s.updateSurvey(s1);
        s.delSurvey(2);
*/


        List<Survey> rs = s.queryProjectId(99);
        for(int i = 0; i < rs.size(); i++) {
            System.out.println(rs.get(i).toString());
        }

    }
}
