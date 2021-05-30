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
 * @author jacki
 */
public class SelectedShowTimePageController implements SeatActionListener{
    
    static SelectedShowTimePageView view;
    static SelectedShowTimePageModel model;
    
    public SelectedShowTimePageController(SelectedShowTimePageView view, SelectedShowTimePageModel model){
        this.view = view;
        this.view.addSeatListener(this);
        this.model = model;
        this.model.addObserver(view);
        this.model.notifyObservers();
    }

    @Override
    public void actionPerformed(ActionEvent e, Seat seat) {
        if(JOptionPane.showConfirmDialog(view,"Do you want to book this seat?","Confirm booking", JOptionPane.YES_NO_OPTION)==0){
            model.dbm.updateSeat(seat.getSeatid());
            JOptionPane.showMessageDialog(view, "Booking Confirmed", "Message", 1);
            
            view.back();
        }
    }

    
}
