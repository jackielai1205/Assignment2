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
public class BookingDetailPageController {
    
    BookingDetailPageModel bookingDetailModel;
    BookingDetailPageView bookingDetailView;

    BookingDetailPageController(BookingDetailPageModel bookingDetailModel, BookingDetailPageView bookingDetailView) {
        this.bookingDetailModel = bookingDetailModel;
        this.bookingDetailView = bookingDetailView;
        bookingDetailModel.addObserver(bookingDetailView);
        bookingDetailView.update(bookingDetailModel, null);
    }
    
    
}
