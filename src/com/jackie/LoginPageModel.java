/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

import java.util.ArrayList;
import java.util.Observable;
import javax.swing.JOptionPane;

/**
 *
 * @author waltersiu
 */
public class LoginPageModel extends Model{
    
    private ArrayList<User> dbUsers;
    private String result = "";

    public LoginPageModel(DatabaseOperation dbm) {
        super(dbm);
        this.dbUsers = dbm.getUser();
        this.setChanged();
    }

    public void compareData(User currentUser){
       
        for(int index = 0; index < this.dbUsers.size(); index++){
            if(currentUser.getEmail().equals(this.dbUsers.get(index).getEmail())){
                if(currentUser.getPassword().equals(this.dbUsers.get(index).getPassword())){
                    result = "success";
                    this.setChanged();
                    this.notifyObservers(result);
                    super.login(currentUser.getEmail());
                    return;
                } else {
                    result = "wrongPassword";
                    this.setChanged();
                    this.notifyObservers(result);
                    return;
                }
            } else {
                result = "wrongEmail";
                this.setChanged();
                this.notifyObservers(result);
                return;
            }
        }

    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    } 
}
