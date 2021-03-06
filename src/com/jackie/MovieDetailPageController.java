package com.jackie;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author jackie
 */
public class MovieDetailPageController implements ActionListener{
    
    
    MovieDetailPageView movieDetailPageView;
    MovieDetailPageModel movieDetailPageModel;
    
    public MovieDetailPageController(MovieDetailPageView view, MovieDetailPageModel model){
        this.movieDetailPageView = view;
        this.movieDetailPageModel = model;
        this.movieDetailPageModel.addObserver(view);
        this.movieDetailPageModel.notifyObservers();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        AllShowTimePageView allShowTimePageView = new AllShowTimePageView(movieDetailPageView);
        AllShowTimePageModel allShowTimePageModel = new AllShowTimePageModel(movieDetailPageModel.movie, movieDetailPageModel.dbm);
        AllShowTimePageController allShowTimePageController =  new AllShowTimePageController(allShowTimePageView, allShowTimePageModel);
        allShowTimePageView.getBack().addActionListener(new BackController(allShowTimePageView));
        movieDetailPageView.setEnabled(false);
        movieDetailPageView.setVisible(false);
    }
   
}
