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
public class MenuPageModel extends Model{
    // get data from database

    public MenuPageModel(DatabaseOperation dbm) {
        super(dbm);
        this.setChanged();
    }
    // get data from database
}
