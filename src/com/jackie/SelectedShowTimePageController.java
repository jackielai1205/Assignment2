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
public class SelectedShowTimePageController implements ActionListener{
    
    View view;
    SelectedShowTimePageModel model;
    
    public SelectedShowTimePageController(View view, SelectedShowTimePageModel model){
        this.view = view;
        this.model = model;
        this.model.addObserver(view);
        this.model.notifyObservers();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
