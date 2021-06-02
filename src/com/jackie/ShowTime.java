package com.jackie;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacki
 */
class ShowTime {
    private Seat[][] seats;
    private String date;
    private String time;
    private int price;
    private int key;
    private int movieid;

    public ShowTime(String date, String time, Seat[][] seats, int price, int key, int movieid) {
        this.seats = seats;
        this.date = date;
        this.time = time;
        this.price = price;
        this.key = key;
        this.movieid = movieid;
    }

    public ShowTime(String date, String time, int price, int key) {
        this.date = date;
        this.time = time;
        this.price = price;
        this.key = key;
    }
    
    public ShowTime(int showTime_id, String date, String time, int price, int movieid){
        this.date = date;
        this.time = time;
        this.price = price;
        this.movieid = movieid;
    }

    public Seat[][] getSeats() {
        return seats;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public int getPrice() {
        return price;
    }

    public boolean compareTo(String date, String time){
        if(this.date.equals(date) && this.time.equals(time)){
            return true;
        }
        return false;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getMovieid() {
        return movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }
    
    
}
