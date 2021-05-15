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
    private String[] castings;
    private String director;
    private String category;
    private double rating;
    private String type;
    private String description;
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

    public String[] getCastings() {
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

    Movie(String name, int length, String[] castings, String director, String category, double rating, String type, String description) {
        this.name = name;
        this.length = length;
        this.castings = castings;
        this.director = director;
        this.category = category;
        this.rating = rating;
        this.description = description;
        this.type = type;
        this.showTimes = new ArrayList<>();
    }

    public String toString() {
        return this.name + " " + this.length + " " + this.castings[0] + " " + this.castings[1] + " " +
                this.castings[2] + " " + this.director + " " + this.category + " " + this.rating + " " + this.description;
    }
    
    //test
    Movie(String name){
        this.name = name;
    }
}
