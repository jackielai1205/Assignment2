/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

import java.awt.event.ActionEvent;

/**
 *
 * @author waltersiu
 */
public class ViewBookingPageController{
    private ViewBookingPageModel viewBookingModel;
    private ViewBookingPageView viewBookingView;
    
    public ViewBookingPageController(ViewBookingPageModel viewBookingModel, ViewBookingPageView viewBookingView){
        this.viewBookingModel = viewBookingModel;
        this.viewBookingView = viewBookingView;
        viewBookingModel.addObserver(viewBookingView);
        viewBookingView.update(viewBookingModel, null);
    }
    
}
