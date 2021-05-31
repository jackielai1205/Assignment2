/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

import java.util.Observable;

/**
 *
 * @author jacki
 */
public abstract class Model extends Observable{
    static String userId;
    DatabaseOperation dbm;
    
    Model(DatabaseOperation dbm){
        this.dbm = dbm;
    }
    
    public void login(String userId){
        this.userId = userId;
    }
    
    public void logout(){
        this.userId = null;
    }

    public static String getUserId() {
        return userId;
    }

    public static void setUserId(String userId) {
        Model.userId = userId;
    }

    public DatabaseOperation getDbm() {
        return dbm;
    }

    public void setDbm(DatabaseOperation dbm) {
        this.dbm = dbm;
    }
    
    
}
