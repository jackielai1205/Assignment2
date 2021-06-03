/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

/**
 *
 * @author waltersiu
 */
public class HomePageModel extends Model{
    private String userName;
    
    public HomePageModel(DatabaseOperation dbm) {
        super(dbm);
        this.userName = super.getUserName();
        this.setChanged();
    }
    
}
