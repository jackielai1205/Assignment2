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
 * @author waltersiu
 */
public class LoginPageController {
    LoginPageModel loginModel;
    LoginPageView loginView;
    MenuPageView menuView;
    
    LoginPageController(LoginPageModel loginModel, LoginPageView loginView, MenuPageView menuView){
        this.loginModel = loginModel;
        this.loginView = loginView;
        
        this.loginView.addOnClickListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent al){
                loginModel.addObserver(loginView);
                User currentLoginUser = new User();
                
                /**
                 * Need to get data from database
                 */
                String dbEmail = "123";
                String dbPassword = "123";
                
                currentLoginUser.setEmail(loginView.getInputEmail());
                currentLoginUser.setPassword(loginView.getInputPassword());
               
                if(currentLoginUser.getEmail().equals(dbEmail)){
                    if(currentLoginUser.getPassword().equals(dbPassword)){
                        // jump to menu page after login
                        JOptionPane.showMessageDialog(loginView, "Login success!");
                        loginView.setVisible(false);
                        menuView.setEnabled(true);
                    }
                }
            }
        });
    }
}
