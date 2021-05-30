/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

import java.util.Observable;

/**
 *
 * @author jacki
 */
public abstract class Model extends Observable{
    DatabaseOperation dbm;
    
    Model(DatabaseOperation dbm){
        this.dbm = dbm;
    }
}
