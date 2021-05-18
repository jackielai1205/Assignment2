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
public abstract class View extends javax.swing.JFrame implements Observer{
    
    View parent;
    
    public View(View parent){
        this.parent = parent;
        this.setResizable(false);
    }
    
    public void back(){
        this.parent.setEnabled(true);
        dispose();
    }
    
    public void addBackButton(JButton back, BackController controller){
        back.addActionListener(controller);
    }
   

}
