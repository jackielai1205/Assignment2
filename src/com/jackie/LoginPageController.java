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
public class LoginPageController{
    private LoginPageModel loginModel;
    private LoginPageView loginView;
    private MenuPageView menuView;
    
    public LoginPageController(LoginPageModel loginModel, LoginPageView loginView, MenuPageView menuView){
        this.loginModel = loginModel;
        this.loginView = loginView;
        this.menuView = menuView;
        
        loginView.submitAddOnClickListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent al){
                loginModel.addObserver(loginView);
                User currentLoginUser = new User("", "", "");

                currentLoginUser.setEmail(loginView.getInputEmail());
                currentLoginUser.setPassword(loginView.getInputPassword());
                
                loginModel.compareData(currentLoginUser);
            }
        });
    }

}
