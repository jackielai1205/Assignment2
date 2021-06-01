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
    
    static AllShowTimePageView allShowTimePageView;
    static AllShowTimePageModel allShowTimePageModel;
    ShowTime showTime;
    
    AllShowTimePageController(ShowTime showTime){
        this.showTime = showTime;
        this.allShowTimePageModel.addObserver(allShowTimePageView);
        this.allShowTimePageModel.notifyObservers();
    }
    
    AllShowTimePageController(AllShowTimePageView allShowTimePageView, AllShowTimePageModel allShowTimePageModel){
        this.allShowTimePageView = allShowTimePageView;
        this.allShowTimePageModel = allShowTimePageModel;
        this.allShowTimePageModel.addObserver(allShowTimePageView);
        this.allShowTimePageModel.notifyObservers();
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        SelectedShowTimePageView selectedShowTimePageView = new SelectedShowTimePageView(allShowTimePageView);
        SelectedShowTimePageModel selectedShowTimePageModel = new SelectedShowTimePageModel(this.showTime, allShowTimePageModel.dbm);
        SelectedShowTimePageController selectedShowTimePageController = new SelectedShowTimePageController(selectedShowTimePageView, selectedShowTimePageModel);
        allShowTimePageView.setEnabled(false);
        allShowTimePageView.setVisible(false);
    }
    
    public void addView(AllShowTimePageView view){
        this.allShowTimePageView = view;
    }
    
    public void addModel(AllShowTimePageModel model){
        this.allShowTimePageModel = model;
    }
    
    public void addShowTime(ShowTime showTime){
        this.showTime = showTime;
    }

    public AllShowTimePageView getAllShowTimePageView() {
        return allShowTimePageView;
    }

    public void setAllShowTimePageView(AllShowTimePageView allShowTimePageView) {
        AllShowTimePageController.allShowTimePageView = allShowTimePageView;
    }

    public AllShowTimePageModel getAllShowTimePageModel() {
        return allShowTimePageModel;
    }

    public void setAllShowTimePageModel(AllShowTimePageModel allShowTimePageModel) {
        AllShowTimePageController.allShowTimePageModel = allShowTimePageModel;
    }

    public ShowTime getShowTime() {
        return showTime;
    }

    public void setShowTime(ShowTime showTime) {
        this.showTime = showTime;
    }
}
