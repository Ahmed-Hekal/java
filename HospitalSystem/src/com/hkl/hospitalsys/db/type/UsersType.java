/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hkl.hospitalsys.db.type;

/**
 *
 * @author User-1
 */
public enum UsersType {
    ADMIN(1, "admin"),
    DOCTOR(2, "doctor");

    private int id;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private UsersType(int id, String type) {
        this.id = id;
        this.type = type;
    }
    
    public static UsersType getUserTypeByID(int id)
    {
        for (UsersType ut : UsersType.values()) {
            if(ut.getId() == id)
                return ut;
        }
        return null;
    }

}
