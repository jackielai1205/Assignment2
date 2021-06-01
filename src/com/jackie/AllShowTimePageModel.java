/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

import java.util.ArrayList;
/**
 *
 * @author jacki
 */
public class AllShowTimePageModel extends Model{
    private ArrayList<ShowTime> showtime;
    private Movie movie;
    
    public AllShowTimePageModel(Movie movie, DatabaseOperation dbm){
        super(dbm);
        this.movie = movie;
        this.showtime = dbm.getAllShowTimeQuery(movie.getMovieid());
        this.setChanged();
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public ArrayList<ShowTime> getShowtime() {
        return showtime;
    }

    public void setShowtime(ArrayList<ShowTime> showtime) {
        this.showtime = showtime;
    }
}
