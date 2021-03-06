/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author waltersiu
 */
public class HomePageController {
    
    private HomePageModel homePageModel;
    private HomePageView homePageView;
    
    public HomePageController(HomePageModel homePageModel, HomePageView homePageView){
        
        this.homePageModel = homePageModel;
        this.homePageView = homePageView;
        homePageModel.addObserver(homePageView);
        homePageModel.notifyObservers();
        
        homePageView.viewMovieButtonAddOnClickListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent al){
                MoviePageModel model = new MoviePageModel(homePageModel.dbm);
                MoviePageView moviePageView = new MoviePageView(homePageView);
                MoviePageController  moviePageController = new MoviePageController(model, moviePageView);
                moviePageView.addBackButton(moviePageView.getBack(), new BackController(moviePageView));
                homePageView.setVisible(false);
            }
        });
        
        homePageView.logoutButtonAddOnClickListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent al){
                homePageModel.logout();
                HomePageController.this.homePageView.setVisible(false);
                HomePageController.this.homePageView.getParent().setVisible(true);
                JOptionPane.showMessageDialog(homePageView, "You have logged out!");
            }
        });
        
        homePageView.viewBookingButtonAddOnClickListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent al){
                ViewBookingPageView viewBookingView = new ViewBookingPageView(homePageView);
                ViewBookingPageModel viewBookingModel = new ViewBookingPageModel(homePageModel.dbm);
                ViewBookingPageController viewBookingController = new ViewBookingPageController(viewBookingModel, viewBookingView);
                viewBookingView.getBackButton().addActionListener(new BackController(viewBookingView));
            }
        });    
    }
}
