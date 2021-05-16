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

    public MoviePageModel() {
        this.movies = new HashMap<>();
        String[] allCasting = {"Alexander Skarsgard", "Rebecca Hall"};
        this.movies.put(0, new Movie("Godzilla Vs Kong", 113, allCasting, "Adam Wingard", "G", 4.5, "Action", "Legends collide in Godzilla vs. Kong as these mythic adversaries meet in a spectacular battle for the ages, with the fate of the world hanging in the balance. Kong and his protectors undertake a perilous journey to find his true home, and with them is Jia, a young orphaned girl with whom he has formed a unique and powerful bond. But they unexpectedly find themselves in the path of an enraged Godzilla, cutting a swath of destruction across the globe. The epic clash between the two titans—instigated by unseen forces—is only the beginning of the mystery that lies deep within the core of the Earth."));
        this.movies.put(1, new Movie("Mortal Kombat"));
        String noSpace = this.movies.get(0).getName().replaceAll("\\s","");
        System.out.println(noSpace);
        this.setChanged();
    }

    public HashMap<Integer, Movie> getMovies() {
        return movies;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
