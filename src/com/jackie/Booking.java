/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

/**
 *
 * @author waltersiu
 */
class Booking {
    int booking_id;
    int showTime_id;
    int seat_id;
    String user_id;
    
    public Booking(int booking_id, int showTime_id, int seat_id, String user_id){
        this.booking_id = booking_id;
        this.showTime_id = showTime_id;
        this.seat_id = seat_id;
        this.user_id = user_id;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public int getShowTime_id() {
        return showTime_id;
    }

    public void setShowTime_id(int showTime_id) {
        this.showTime_id = showTime_id;
    }

    public int getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(int seat_id) {
        this.seat_id = seat_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    
    
}
