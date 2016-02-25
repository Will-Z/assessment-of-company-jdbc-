package com.model;

/**
 * Created by Will on 12/31/15.
 */
public class MyAdmin implements java.io.Serializable {
    //field
    /**  **/
    private int adminId;
    /**  **/
    private String adminName;
    /**  **/
    private String password;

    public MyAdmin() {

    }

    public MyAdmin(int adminId, String adminName, String password) {
        super();
        this.adminId = adminId;
        this.adminName = adminName;
        this.password = password;
    }
    public int getAdminId() {
        return adminId;
    }
    public String getAdminName() {
        return adminName;
    }
    public String getPassword() {
        return password;
    }
    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "MyAdmin \nadminId=" + adminId + ",\n adminName="
                + adminName + ",\n password=" + password;
    }

}