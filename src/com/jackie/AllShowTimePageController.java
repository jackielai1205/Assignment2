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
public class AllShowTimePageController implements ActionListener{
    
    View view;
    AllShowTimePageModel allShowTimePageModel;
    
    AllShowTimePageController(View view, AllShowTimePageModel model){
        this.view = view;
        this.allShowTimePageModel = model;
        this.allShowTimePageModel.addObserver(view);
        this.allShowTimePageModel.notifyObservers();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
