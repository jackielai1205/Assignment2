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
    
    public void registerToDatabase(User user){
        // Add data to database
        System.out.print("done!");
        this.setChanged();
        this.notifyObservers();
    }   
}
