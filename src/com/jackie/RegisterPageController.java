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
public class RegisterPageController {
    
    RegisterPageModel registerModel;
    RegisterPageView registerView;
    MenuPageView menuView;
    
    RegisterPageController(RegisterPageModel registerModel, RegisterPageView registerView, MenuPageView menuView){
        this.registerModel = registerModel;
        this.registerView = registerView;
        this.menuView = menuView;
        
        this.registerView.addOnClickListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent al){
                registerModel.addObserver(registerView);
                User currentUser = new User();
              
                /***
                 * Need change to get data from database
                 * Hard code for checkInfo only 
                 */
                String dbEmail = "123"; 

                currentUser.setEmail(registerView.getInputEmail());
                currentUser.setPassword(registerView.getInputPassword());
                String confirmPassword = registerView.getInputConfirm();
                currentUser.setName(registerView.getInputName());
                
                if(currentUser.getEmail().equals(dbEmail)){
                    JOptionPane.showMessageDialog(registerView, "Email have been registered. Bye!");
                } else if(!currentUser.getPassword().equals(confirmPassword)){
                    JOptionPane.showMessageDialog(registerView, "Confirm password and password not match. Bye");
                }  else {
                    registerModel.registerToDatabase(currentUser);
                    JOptionPane.showMessageDialog(registerView, "Register success!");
                    registerView.setVisible(false);
                    menuView.setEnabled(true);
                }
            }
        });
    }
}
