package com.model;

/**
 * Created by Will on 12/31/15.
 */

public class Corperation implements java.io.Serializable {
    //field
    /**  **/
    private int corId;
    /**  **/
    private String corName;
    /**  **/
    private int hasReward;
    /**  **/
    private Double goodRate;
    /**  **/
    private Double reworkLossrate;
    /**  **/
    private Double ontimeRate;
    /**  **/
    private Double savingRate;
    /**  **/
    private Double casualtyRate;
    /**  **/
    private Double environmentAccidentloss;
    public Corperation(){}
    public Corperation(int corId, String corName, int hasReward,
                       Double goodRate, Double rewordLossrate, Double ontimeRate,
                       Double savingRate, Double casualtyRate,
                       Double environmentAccidentloss) {
        super();
        this.corId = corId;
        this.corName = corName;
        this.hasReward = hasReward;
        this.goodRate = goodRate;
        this.reworkLossrate = rewordLossrate;
        this.ontimeRate = ontimeRate;
        this.savingRate = savingRate;
        this.casualtyRate = casualtyRate;
        this.environmentAccidentloss = environmentAccidentloss;
    }
    public int getCorId() {
        return corId;
    }
    public String getCorName() {
        return corName;
    }
    public int getHasReward() {
        return hasReward;
    }
    public Double getGoodRate() {
        return goodRate;
    }
    public Double getReworkLossrate() {
        return reworkLossrate;
    }
    public Double getOntimeRate() {
        return ontimeRate;
    }
    public Double getSavingRate() {
        return savingRate;
    }
    public Double getCasualtyRate() {
        return casualtyRate;
    }
    public Double getEnvironmentAccidentloss() {
        return environmentAccidentloss;
    }
    public void setCorId(int corId) {
        this.corId = corId;
    }
    public void setCorName(String corName) {
        this.corName = corName;
    }
    public void setHasReward(int hasReward) {
        this.hasReward = hasReward;
    }
    public void setGoodRate(Double goodRate) {
        this.goodRate = goodRate;
    }
    public void setReworkLossrate(Double rewordLossrate) {
        this.reworkLossrate = rewordLossrate;
    }
    public void setOntimeRate(Double ontimeRate) {
        this.ontimeRate = ontimeRate;
    }
    public void setSavingRate(Double savingRate) {
        this.savingRate = savingRate;
    }
    public void setCasualtyRate(Double casualtyRate) {
        this.casualtyRate = casualtyRate;
    }
    public void setEnvironmentAccidentloss(Double environmentAccidentloss) {
        this.environmentAccidentloss = environmentAccidentloss;
    }
    @Override
    public String toString() {
        return "Corperation \ncorId=" + corId + ",\n corName=" + corName
                + ",\n hasReward=" + hasReward + ",\n goodRate=" + goodRate
                + ",\n reworkLossrate=" + reworkLossrate
                + ",\n ontimeRate=" + ontimeRate + ",\n savingRate="
                + savingRate + ",\n casualtyRate=" + casualtyRate
                + ",\n environmentAccidentloss=" + environmentAccidentloss;
    }


}