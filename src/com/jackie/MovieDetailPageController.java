package com.jackie;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jackie.MovieDetailPageModel;
import com.jackie.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author jacki
 */
public class MovieDetailPageController implements ActionListener{
    
    
    View view;
    MovieDetailPageModel movieDetailPageModel;
    
    public MovieDetailPageController(View view, MovieDetailPageModel model){
        this.view = view;
        this.movieDetailPageModel = model;
        this.movieDetailPageModel.addObserver(view);
        this.movieDetailPageModel.notifyObservers();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.view.back();
    }
}
