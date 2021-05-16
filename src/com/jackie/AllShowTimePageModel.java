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
public class AllShowTimePageModel extends Observable{
    Movie movie;
    
    public AllShowTimePageModel(Movie movie){
        this.movie = movie;
        this.setChanged();
    }
}
