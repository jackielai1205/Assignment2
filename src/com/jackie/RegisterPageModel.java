package com.jackie;


import java.util.Observable;
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
public class RegisterPageModel extends Observable{
    
    // get data from database
    String dbEmail = "123";

    public void compareData(User currentUser){
        
        String result = "";
        
        // get data from controller and compare to database, then notify result to View
        
        if(currentUser.getEmail().equals(dbEmail)){
            result = "fail";
            this.setChanged();
            this.notifyObservers(result);
//        } else if(!currentUser.getPassword().equals(confirmPassword)){
//            JOptionPane.showMessageDialog(registerView, "Confirm password and password not match. Bye");
//        }  else {
//            registerModel.registerToDatabase(currentUser);
//            JOptionPane.showMessageDialog(registerView, "Register success!");
//            registerView.setVisible(false);
//            menuView.setEnabled(true);
//        }
    }
    
//    public void registerToDatabase(User user){
//
//        
//        // Add data to database
//        System.out.print("done!");
//        this.setChanged();
//        this.notifyObservers();
    }   
}
