package com.jackie;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jackie
 */
public class MovieDetailPageModel extends Model{

    Movie movie;
    
    MovieDetailPageModel(Movie movie, DatabaseOperation dbm){
        super(dbm);
        this.movie = movie;
        this.setChanged();
    }
    
}
