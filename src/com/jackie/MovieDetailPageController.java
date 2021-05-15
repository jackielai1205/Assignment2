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
 * @author jacki
 */
public class MovieDetailPageController implements ActionListener{
    
    
    View view;
    MovieDetailPageModel movieDetailPageModel;
    
    MovieDetailPageController(View view, MovieDetailPageModel model){
        this.view = view;
        this.movieDetailPageModel = model;
        this.movieDetailPageModel.addObserver(view);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
