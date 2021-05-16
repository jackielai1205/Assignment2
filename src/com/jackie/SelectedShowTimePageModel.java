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
public class SelectedShowTimePageModel extends Observable{
    
    ShowTime showtime;
    
    public SelectedShowTimePageModel(ShowTime showtime){
        this.showtime = showtime;
        this.setChanged();
    }
    
}
