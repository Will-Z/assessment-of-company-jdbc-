package com.action;

import com.dao.CorperationDao;
import com.model.Corperation;

import java.util.List;

/**
 * Created by Will on 12/31/15.
 */
public class CorperationAction {

    public static void main(String[] args) throws Exception {
        CorperationDao c = new CorperationDao();
        Corperation c1 = new Corperation();
/*
        c1.setCorName("Microsoft");
        c1.setGoodRate(1.0);
        c1.setReworkLossrate(0.8);
        c1.setOntimeRate(0.3);
        c1.setSavingRate(0.4);
        c1.setCasualtyRate(0.33);
        c1.setEnvironmentAccidentloss(99.3);
        c1.setCorId(1);
        c1.setHasReward(1);
*/

        List<Corperation> rs = c.query("Google");
        for(int i = 0; i < rs.size(); i++) {
            System.out.println(rs.get(i).toString());
        }


    }
}
