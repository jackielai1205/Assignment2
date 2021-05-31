package com.jackie;


import java.util.ArrayList;
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
public class RegisterPageModel extends Model{
    
    ArrayList<User> dbUsers;
    String result = "";

    public RegisterPageModel(DatabaseOperation dbm) {
        super(dbm);
        this.dbUsers = dbm.getUser();
        this.setChanged();
    }

    public void compareData(User currentUser){
        
        for(int index = 0; index < this.dbUsers.size(); index++){
            if(currentUser.getEmail().equals(this.dbUsers.get(index).getEmail())){
                result = "fail";
                this.setChanged();
                this.notifyObservers(result);
            }
        }
        
        if(result.equals("")){
            dbm.updateUserAfterRegister(currentUser);
            this.setChanged();
            this.notifyObservers(result);
        }

        
        // get data from controller and compare to database, then notify result to View
        
//        if(currentUser.getEmail().equals(dbEmail)){
//            result = "fail";
//            this.setChanged();
//            this.notifyObservers(result);
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

