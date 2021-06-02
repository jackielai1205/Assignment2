/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

import java.util.ArrayList;

/**
 *
 * @author waltersiu
 */
public class ViewBookingPageModel extends Model{
    
    private String currentUserId = super.getUserId(); //Get current User's user id
    // Get all booking record using user's user id
    private ArrayList<Booking> currentUserBooking = dbm.getUserBookingFromBooking(currentUserId); 
    private ArrayList<ShowTime> currentUserShowTime = getShowTimeInfo();
    private ArrayList<String> currentMoiveName = getMovieName();
    
    public ViewBookingPageModel(DatabaseOperation dbm) {
        super(dbm);
    }
    
    public ArrayList<ShowTime> getShowTimeInfo(){
        ArrayList<ShowTime> showTimeList = new ArrayList<ShowTime>();
        for(int index = 0; index < this.currentUserBooking.size(); index++){
            ShowTime showTime = dbm.getUserShowTimeInfo(this.currentUserBooking.get(index).getShowTime_id());
            showTimeList.add(showTime);
        }
        return showTimeList;
    }
    
    public ArrayList<String> getMovieName(){
        ArrayList<String> movieNameList = new ArrayList<String>();
        for(int index= 0; index < this.currentUserShowTime.size(); index++){
            String movieName = dbm.getBookingMovieName(this.currentUserShowTime.get(index).getMovieid());
            movieNameList.add(movieName);
        }
        return movieNameList;
    }

    public String getCurrentUserId() {
        return currentUserId;
    }

    public void setCurrentUserId(String currentUserId) {
        this.currentUserId = currentUserId;
    }

    public ArrayList<Booking> getCurrentUserBooking() {
        return currentUserBooking;
    }

    public void setCurrentUserBooking(ArrayList<Booking> currentUserBooking) {
        this.currentUserBooking = currentUserBooking;
    }

    public ArrayList<ShowTime> getCurrentUserShowTime() {
        return currentUserShowTime;
    }

    public void setCurrentUserShowTime(ArrayList<ShowTime> currentUserShowTime) {
        this.currentUserShowTime = currentUserShowTime;
    }

    public ArrayList<String> getCurrentMoiveName() {
        return currentMoiveName;
    }

    public void setCurrentMoiveName(ArrayList<String> currentMoiveName) {
        this.currentMoiveName = currentMoiveName;
    }
    
}
