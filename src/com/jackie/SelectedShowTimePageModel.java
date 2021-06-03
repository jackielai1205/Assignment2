/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

import java.util.ArrayList;

/**
 *
 * @author jackie
 */
public class SelectedShowTimePageModel extends Model{
    
    ArrayList<Seat> seats;
    ShowTime showtime;
    
    public SelectedShowTimePageModel(ShowTime showtime, DatabaseOperation dbm){
        super(dbm);
        this.showtime = showtime;
        this.seats = dbm.getSeatQuery(showtime.getKey());
        this.setChanged();
    } 
}
