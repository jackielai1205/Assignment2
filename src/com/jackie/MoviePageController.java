package com.jackie;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacki
 */
public class MoviePageController implements ActionListener{
    
    View view;
    Model model;
    
    MoviePageController(View view, Model model){
        this.view = view;
        this.model = model;
        model.addObserver(view);
        model.notifyObservers(view);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
