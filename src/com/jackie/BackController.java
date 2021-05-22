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
 * @author jacki
 */
public class BackController implements ActionListener{
    
    Page page;
    
    public BackController(Page view){
        this.page = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.page.back();
    }
}
