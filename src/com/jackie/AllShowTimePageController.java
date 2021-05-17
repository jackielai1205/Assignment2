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
    
    AllShowTimePageView allShowTimePageView;
    AllShowTimePageModel allShowTimePageModel;
    
    AllShowTimePageController(AllShowTimePageView allShowTimePageView, AllShowTimePageModel model){
        this.allShowTimePageView = allShowTimePageView;
        this.allShowTimePageModel = model;
        this.allShowTimePageModel.addObserver(allShowTimePageView);
        this.allShowTimePageModel.notifyObservers();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.allShowTimePageView.back();
    }
    
}
