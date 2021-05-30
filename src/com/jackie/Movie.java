package com.jackie;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacki
 */
public class Movie {
    private String name;
    private int length;
    private String castings;
    private String director;
    private String category;
    private double rating;
    private String type;
    private String description;
    private String image;
    private int movieid;
    ArrayList<ShowTime> showTimes;

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public String getCastings() {
        return castings;
    }

    public String getDirector() {
        return director;
    }

    public String getCategory() {
        return category;
    }

    public double getRating() {
        return rating;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<ShowTime> getShowTimes() {
        return showTimes;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getMovieid() {
        return movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }
    
    Movie(int movieid, String name, int length, String castings, String director, String category, double rating, String type, String description, String image) {
        this.movieid = movieid;
        this.name = name;
        this.length = length;
        this.castings = castings;
        this.director = director;
        this.category = category;
        this.rating = rating;
        this.description = description;
        this.type = type;
        this.image = image;
        this.showTimes = new ArrayList<>();
    }

    public String toString() {
        return this.name + " " + this.length + " " + this.castings + " " + this.director + " " + this.category + " " + this.rating + " " + this.description;
    }
    
    public void addShowTime(ShowTime showTime){
        this.showTimes.add(showTime);
    }
    
    //test
    Movie(String name){
        this.name = name;
    }
}
