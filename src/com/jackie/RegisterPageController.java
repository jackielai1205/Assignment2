package com.jackie;

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
public class RegisterPageController {
    
    RegisterPageModel registerModel;
    RegisterPageView registerView;
    
    RegisterPageController(RegisterPageModel registerModel, RegisterPageView registerView){
        this.registerModel = registerModel;
        this.registerView = registerView;
        
        this.registerView.addOnClickListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent al){
                registerModel.addObserver(registerView);
                User currentUser = new User();
                String checkEmail = "123";

                currentUser.setEmail(registerView.getInputEmail());
                currentUser.setPassword(registerView.getInputPassword());
                String confirmPassword = registerView.getInputConfirm();
                currentUser.setName(registerView.getInputName());
                
                if(currentUser.getEmail().equals(checkEmail)){
                    JOptionPane.showMessageDialog(registerView, "Email have been registered. Bye!");
                } else if(!currentUser.getPassword().equals(confirmPassword)){
                    JOptionPane.showMessageDialog(registerView, "Confirm password and password not match. Bye");
                }  else {
                    registerModel.registerToDatabase(currentUser);
                    JOptionPane.showMessageDialog(registerView, "Register success!");
                    registerView.setVisible(false);
                }
            }
        });
    }
}
