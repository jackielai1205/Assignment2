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
 * @author waltersiu
 */
public class MenuPageController{
    
    public MenuPageController(MenuPageModel menuModel, MenuPageView menuView){
        
        menuView.registerAddOnClickListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent al){
                RegisterPageView registerView = new RegisterPageView(menuView);
                RegisterPageModel registerModel = new RegisterPageModel(menuModel.dbm);
                RegisterPageController registerController = new RegisterPageController(registerModel, registerView);
            }
        });
        
        menuView.loginAddOnClickListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent al){
                LoginPageView loginView = new LoginPageView(menuView, menuModel.dbm);
                LoginPageModel loginModel = new LoginPageModel(menuModel.dbm);
                LoginPageController loginController = new LoginPageController(loginModel, loginView, menuView);
            }
        });
        
        menuView.exitAddOnClickListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent al){
                System.exit(0);
            }
        });
    }
}