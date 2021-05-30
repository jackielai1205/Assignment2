package com.jackie;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Observable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacki
 */
public class MoviePageModel extends Observable{
    private HashMap<Integer, Movie> movies;
    private ArrayList<User> users;
    private DatabaseOperation dbm; 

    public MoviePageModel(DatabaseOperation dbm) {
        this.dbm = dbm;
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
