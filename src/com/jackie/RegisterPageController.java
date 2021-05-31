package com.jackie;

import com.jackie.RegisterPageModel;
import com.jackie.RegisterPageView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waltersiu
 */
public class RegisterPageController implements ActionListener{
    
    RegisterPageModel registerModel;
    RegisterPageView registerView;
    
    RegisterPageController(){
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        registerModel.addObserver(registerView);
        User currentUser = new User();

        currentUser.setEmail(registerView.getInputEmail());
        currentUser.setPassword(registerView.getInputPassword());
        String confirmPassword = registerView.getInputConfirm();
        currentUser.setName(registerView.getInputName());

        // pass value to model
        registerModel.compareData(currentUser);
    }
    
    public void addModel(RegisterPageModel m) {
        this.registerModel = m;
    }

    public void addView(RegisterPageView v) {
        this.registerView = v;
    }
    
}
