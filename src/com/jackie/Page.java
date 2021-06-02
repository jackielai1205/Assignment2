package com.jackie;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Observer;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacki
 */
public abstract class Page extends javax.swing.JFrame implements Observer{
    
    private Page parent;
    
    public Page(Page parent){
        this.parent = parent;
        this.setResizable(false);
    }
    
    public void back(){
        this.parent.setVisible(true);
        this.parent.setEnabled(true);
        dispose();
    }
    
    public void addBackButton(JButton back, BackController controller){
        back.addActionListener(controller);
    }
    
    public void closeView(){
        this.parent.setVisible(false);
    }

    public Page getParent() {
        return parent;
    }

    public void setParent(Page parent) {
        this.parent = parent;
    }
}
