package com.action;

import com.dao.SurveyResultDao;
import com.model.SurveyResult;
import java.util.*;

/**
 * Created by Will on 1/1/16.
 */
public class SurveyResultAction {
    public static void main(String[] args) throws Exception {
        SurveyResultDao s = new SurveyResultDao();
        SurveyResult s1 = new SurveyResult();
/*
        s1.setProjectId(1);
        s1.setCorId(1);
        s1.setGrade(3.14);

        //s.addSurveyResult(s1);
        s.updateSurveyResult(s1);

*/


        List<SurveyResult> rs = s.query(1, 1);
        for(int i = 0; i < rs.size(); i++) {
            System.out.println(rs.get(i).toString());
        }


    }
}
