/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

import java.util.Observable;

/**
 *
 * @author waltersiu
 */
public class ViewBookingPageModel extends Observable{
    
    Movie still;
    
    ViewBookingPageModel(){
        // get data from database
        String[] hi = {"shit"};
        still = new Movie(1, "still", 1, "", "", "", 1, "", "", "");
        this.setChanged();
        this.notifyObservers();
    }
}
