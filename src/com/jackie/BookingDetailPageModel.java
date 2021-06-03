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
public class BookingDetailPageModel extends Model {
    
    private Booking currentBooking;
    private ShowTime currentUserShowTime; 
    private String currentMoiveName;
    
    public BookingDetailPageModel(DatabaseOperation dbm, Booking currentBooking) {
        super(dbm);
        this.currentBooking = currentBooking;
        this.currentUserShowTime = dbm.getUserShowTimeInfo(this.getCurrentBooking().getShowTime_id());
        this.currentMoiveName = dbm.getBookingMovieName(this.getCurrentUserShowTime().getMovieid());
    }

    public Booking getCurrentBooking() {
        return currentBooking;
    }

    public void setCurrentBooking(Booking currentBooking) {
        this.currentBooking = currentBooking;
    }

    public ShowTime getCurrentUserShowTime() {
        return currentUserShowTime;
    }

    public void setCurrentUserShowTime(ShowTime currentUserShowTime) {
        this.currentUserShowTime = currentUserShowTime;
    }

    public String getCurrentMoiveName() {
        return currentMoiveName;
    }

    public void setCurrentMoiveName(String currentMoiveName) {
        this.currentMoiveName = currentMoiveName;
    }
}
