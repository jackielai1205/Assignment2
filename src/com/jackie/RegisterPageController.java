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
 * @author waltersiu
 */
public class RegisterPageController{
    
    private RegisterPageModel registerModel;
    private RegisterPageView registerView;
    
    RegisterPageController(RegisterPageModel registerModel, RegisterPageView registerView){
        this.registerModel = registerModel;
        this.registerView = registerView;
        
        registerView.submitAddOnClickListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                registerModel.addObserver(registerView);
                User currentUser = new User("", "", "");

                currentUser.setEmail(registerView.getInputEmail());
                currentUser.setPassword(registerView.getInputPassword());
                String confirmPassword = registerView.getInputConfirm();
                currentUser.setName(registerView.getInputName());

                // pass value to model
                registerModel.compareData(currentUser, confirmPassword);
            }
        });    
    }
}
