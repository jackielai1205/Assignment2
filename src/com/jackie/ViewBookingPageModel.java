/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author waltersiu
 */
public class ViewBookingPageModel extends Model{
    
    String currentUserId = super.getUserId(); //Get current User's user id
    // Get all booking record using user's user id
    ArrayList<Booking> currentUserBooking = dbm.getUserBookingFromBooking(currentUserId); 
    ArrayList<ShowTime> currentUserShowTime = getShowTimeInfo();
    
    public ViewBookingPageModel(DatabaseOperation dbm) {
        super(dbm);
    }
    
    public ArrayList<ShowTime> getShowTimeInfo(){
        ArrayList<ShowTime> showTimeList = null;
        for(int index = 0; index < this.currentUserBooking.size(); index++){
            ShowTime showTime = dbm.getUserShowTimeInfo(currentUserBooking.get(index).getShowTime_id());
            showTimeList.add(showTime);
        }
        return showTimeList;
    }
    
}
