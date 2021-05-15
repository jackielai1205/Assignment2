package com.jackie;

import com.jackie.RegisterPageModel;
import com.jackie.RegisterPageView;
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
public class RegisterPageController {
    
    RegisterPageModel model;
    RegisterPageView register;
    
    public RegisterPageController(RegisterPageModel model, RegisterPageView register){
        this.model = model;
        this.register = register;
        
        this.register.addOnClickListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent al){
                model.addObserver(register);
                String email;
                String password;
                String confirm;
                String name;

                email = register.getInputEmail();
                password = register.getInputPassword();
                confirm = register.getInputConfirm();
                name = register.getInputName();
                
                model.compareInfo(email, password, confirm, name);
            }
        });
    }
    
}
