package com.jackie;


import java.util.ArrayList;

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
    
    private ArrayList<User> dbUsers;
    private String result = "";

    public RegisterPageModel(DatabaseOperation dbm) {
        super(dbm);
        this.dbUsers = dbm.getUser();
        this.setChanged();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    //Compare user input data to database user data
    //And return compare result to View
    public void compareData(User currentUser, String confirmPassword){
        final String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9]+.com$";
        if(currentUser.getEmail().equals("")){
            result = "emailempty";
            this.setChanged();
            this.notifyObservers(result);
        } else if(currentUser.getPassword().equals("")){
            result = "passwordempty";
            this.setChanged();
            this.notifyObservers(result);
        } else if(confirmPassword.equals("")){
            result = "confirmempty";
            this.setChanged();
            this.notifyObservers(result);
        } else if(currentUser.getName().equals("")){
            result = "nameempty";
            this.setChanged();
            this.notifyObservers(result);        
        } else if(currentUser.getEmail().matches(regex)){
            for(int index = 0; index < this.dbUsers.size(); index++){
                if(currentUser.getEmail().equals(this.dbUsers.get(index).getEmail())){
                    result = "equal";
                    this.setChanged();
                    this.notifyObservers(result);
                } else if(!currentUser.getPassword().equals(confirmPassword)){
                    result = "passwordnotmatch";
                    this.setChanged();
                    this.notifyObservers(result);
                    return;
                }                    
            }
        } else {
            result = "notmatch";
            this.setChanged();
            this.notifyObservers(result);
        }
        if(result.equals("")){
            dbm.updateUserAfterRegister(currentUser);
            this.setChanged();
            this.notifyObservers(result);
        }
    }
}   

