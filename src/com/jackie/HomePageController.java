/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author waltersiu
 */
public class HomePageController {
    
    public HomePageController(HomePageModel homePageModel, HomePageView homePageView){
        
        homePageView.viewMovieButtonAddOnClickListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent al){
                MoviePageModel model = new MoviePageModel(homePageModel.dbm);
                MoviePageView moviePageView = new MoviePageView(homePageView);
                MoviePageController  moviePageController = new MoviePageController(model, moviePageView);
            }
        });
        
        homePageView.viewBookingButtonAddOnClickListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent al){
                ViewBookingPageView viewBookingView = new ViewBookingPageView(homePageView);
                ViewBookingPageModel viewBookingModel = new ViewBookingPageModel(homePageModel.dbm);
                ViewBookingPageController viewBookingController = new ViewBookingPageController(viewBookingModel, viewBookingView);
            }
        });
        
        homePageView.viewMovieButtonAddOnClickListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent al){
                
            }
        });
        
    }
 
}
