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

    public ShowTime(String date, String time, Seat[][] seats, int price) {
        this.seats = seats;
        this.date = date;
        this.time = time;
        this.price = price;
    }

    public ShowTime(String date, String time) {
        this.date = date;
        this.time = time;
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
}
