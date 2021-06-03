/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jacki
 */
public final class Database {

    private static final String USER_NAME = "pdc";
    private static final String PASSWORD = "pdc";
    private static final String URL = "jdbc:derby://localhost:1527/assign2";  //derby.jar

    Connection conn;

    public Database() {
        establishConnection();
    }

    public static void main(String[] args) {
        Database dbManager = new Database();
        System.out.println(dbManager.getConnection());
    }

    public Connection getConnection() {
        return this.conn;
    }

    //Establish connection
    public void establishConnection() {
        if (this.conn == null) {
            try {
                conn = DriverManager.getConnection(this.URL, this.USER_NAME, this.PASSWORD);
                System.out.println(this.URL + "   CONNECTED....");

            } catch (SQLException ex) {
                System.out.println("Unable to connect database");

            }
        }
    }

    public void closeConnections() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println("Unable to close database");
            }
        }
    }
   
}
