package com.jackie;


import java.util.Observable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waltersiu
 */
public class RegisterModel extends Observable{
    
    public void compareInfo(String email, String password, String confirm, String name){
        
        String checkEmail = "Sam";
        String checkPassword = "Sam";
        String checkConfirm = "Sam";
        String checkname = "Sam";
        
        if(email.equals(checkEmail)){
            
        }
        
        this.setChanged();
        this.notifyObservers();
    }
    
}
