package com.jackie;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacki
 */
public class BookingSystem {

    public static void main(String[] args) {
        DatabaseOperation dbOperation = new DatabaseOperation();
        dbOperation.createTable();
        System.out.println(dbOperation);
        MoviePageModel model = new MoviePageModel(dbOperation);
        MoviePageView moviePageView = new MoviePageView(null);
        MoviePageController moviePageController = new MoviePageController(model, moviePageView);
        
        MenuPageView menuView = new MenuPageView(null);
        MenuPageModel menuModel = new MenuPageModel(dbOperation);
        MenuPageController menucontroller = new MenuPageController(menuModel, menuView);

    }
}
