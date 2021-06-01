package com.jackie;


import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jackie
 */
public class MoviePageModel extends Model{
    private HashMap<Integer, Movie> movies;
    private ArrayList<User> users;
    
    public MoviePageModel(DatabaseOperation dbm) {
        super(dbm);
        this.movies = dbm.getAllMovieQuery();
        this.setChanged();
    }

    public HashMap<Integer, Movie> getMovies() {
        return movies;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
