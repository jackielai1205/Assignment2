/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author jacki
 */
public class SelectedShowTimePageController implements SeatActionListener{
    
    static SelectedShowTimePageView view;
    static SelectedShowTimePageModel model;
    
    public SelectedShowTimePageController(SelectedShowTimePageView view, SelectedShowTimePageModel model){
        SelectedShowTimePageController.view = view;
        SelectedShowTimePageController.view.addSeatListener(this);
        SelectedShowTimePageController.model = model;
        SelectedShowTimePageController.model.addObserver(view);
        SelectedShowTimePageController.model.notifyObservers();
    }

    @Override
    public void actionPerformed(ActionEvent e, Seat seat) {
        if(JOptionPane.showConfirmDialog(view,"Do you want to book this seat?","Confirm booking", JOptionPane.YES_NO_OPTION)==0){
            model.dbm.updateSeat(seat.getSeatid());
            JOptionPane.showMessageDialog(view, "Booking Confirmed", "Message", 1);
            model.dbm.InsertBooking(Model.userId, model.showtime.getKey(), seat.getSeatid());
            view.back();
        }
    }
}
