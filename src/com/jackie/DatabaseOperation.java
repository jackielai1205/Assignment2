/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.sql.*;  


/**
 *
 * @author jacki
 */
public class DatabaseOperation {
    /*
 * The programs are designed for PDC paper
 */ 
/**
 *
 * @author Quan Bai and Weihua Li
 * @Note Database Operation Component
 */

    private Database dbManager;

    public DatabaseOperation() { 
        dbManager = new Database();
    }

    public void createTable() {
        try {
            DatabaseMetaData dbm = this.dbManager.conn.getMetaData();
            ResultSet tables = dbm.getTables(null, null, "MOVIE", null);
            Statement statement = dbManager.getConnection().createStatement();
            String movieTable = "Movie";
            String showTimeTable = "ShowTime";
            String seatTable = "Seat";
            String customerTable = "Customer";
            String bookingTable = "Booking";
            if(!tables.next()){
                //Create Movie table
                String sqlCreate = "create table " + movieTable + " ("
                        + "Movie_id int PRIMARY KEY GENERATED ALWAYS AS IDENTITY " 
                        + "(START WITH 1, INCREMENT BY 1),"
                        + "Name varchar(30), Length int, Castings varchar(100),"
                        + "Director varchar(20), Category varchar(20), Rating double,"
                        + "Type varchar(20), Description varchar(1000), Image varchar(50))";
                statement.executeUpdate(sqlCreate);
                
                //Create ShowTime table
                sqlCreate = "create table " + showTimeTable + " (ShowTime_id int not null PRIMARY KEY GENERATED ALWAYS AS IDENTITY"
                        + "(START WITH 1, INCREMENT BY 1),"
                        + "Date varchar(20), Time varchar(20), Price int,"
                        + "Movie_id int,"
                        + "FOREIGN KEY (Movie_id) REFERENCES Movie(Movie_id))";
                statement.executeUpdate(sqlCreate);
                
                //Create Seat table
                sqlCreate = "create table " + seatTable + " (Seat_id int not null PRIMARY KEY GENERATED ALWAYS AS IDENTITY "
                        + "(START WITH 1, INCREMENT BY 1),"
                        + "Column1 int, Row int, Available boolean, ShowTime_id int,"
                        + "FOREIGN KEY (ShowTime_id) REFERENCES " + showTimeTable + "(ShowTime_id))";
                statement.executeUpdate(sqlCreate);
                
                //Create User table
                sqlCreate = "create table " + customerTable + " (User_id varchar(255) not null PRIMARY KEY,"
                        + "User_name varchar(255), User_password varchar(255))";
                statement.executeUpdate(sqlCreate);
                
                
                //Create Booking table
                sqlCreate = "create table " + bookingTable + "  (Booking_id int not null PRIMARY KEY GENERATED ALWAYS AS IDENTITY"
                        + "(START WITH 1, INCREMENT BY 1),"
                        + "ShowTime_id int, Seat_id int, User_id varchar(255), "
                        + "FOREIGN KEY (ShowTime_id) REFERENCES " + showTimeTable + "(ShowTime_id), "
                        + "FOREIGN KEY (Seat_id) REFERENCES " + seatTable + "(Seat_id), "
                        + "FOREIGN KEY (User_id) REFERENCES " + customerTable + "(User_id))";
                statement.executeUpdate(sqlCreate);
                
                //insert a movie to movie table
                String sqlInsert = "insert into " + movieTable + " (Name, Length, Castings, Director, Category, Rating, Type, Description, Image) values("
                    + "'Godzilla vs Kong', 113, 'Alexander Skarsgard, Rebecca Hall, Millie Bobby Brown',"
                    + "'Adam Wingard','G',4.5,'Action',"
                    + "'Legends collide in Godzilla vs. Kong as these mythic adversaries meet in a spectacular battle for the ages, with the fate of the world hanging in the balance. Kong and his protectors undertake a perilous journey to find his true home, and with them is Jia, a young orphaned girl with whom he has formed a unique and powerful bond. But they unexpectedly find themselves in the path of an enraged Godzilla, cutting a swath of destruction across the globe. The epic clash between the two titans—instigated by unseen forces—is only the beginning of the mystery that lies deep within the core of the Earth.',"
                    + "'/com/jackie/GodzillaVsKong.jpg')";
                statement.executeUpdate(sqlInsert); 
                
                //insert a movie to movie table
                sqlInsert = "insert into " + movieTable + " (Name, Length, Castings, Director, Category, Rating, Type, Description, Image) values("
                    + "'Mortal Kombat', 110, 'Lewis Tan, Jessica McNamee, Josh Lawson',"
                    + "'Simon McQuoid','III',3.5,'Action',"
                    + "'Mortal Kombat is a 2021 American martial arts fantasy film based on the video game franchise of the same name and a reboot of the Mortal Kombat film series.',"
                    + "'/com/jackie/MortalKombat.jpg')";
                statement.executeUpdate(sqlInsert); 

                
                //insert a showtime to showtime table
                sqlInsert = "insert into " + showTimeTable + "(Date, Time, Price, Movie_id) values("
                + "'18/06', '08:00', 15, 1)";
                statement.executeUpdate(sqlInsert); 

                sqlInsert = "insert into " + showTimeTable + " (Date, Time, Price, Movie_id) values("
                + "'18/06', '12:00', 15, 1)";
                statement.executeUpdate(sqlInsert); 

                sqlInsert = "insert into " + showTimeTable + " (Date, Time, Price, Movie_id) values("
                + "'22/06', '12:00', 15, 1)";
                statement.executeUpdate(sqlInsert); 

                sqlInsert = "insert into " + showTimeTable + " (Date, Time, Price, Movie_id) values("
                + "'18/06', '08:00', 15, 2)";
                statement.executeUpdate(sqlInsert); 

                sqlInsert = "insert into " + showTimeTable + " (Date, Time, Price, Movie_id) values("
                + "'18/06', '12:00', 15, 2)";
                statement.executeUpdate(sqlInsert); 
                
                sqlInsert = "insert into " + showTimeTable + " (Date, Time, Price, Movie_id) values("
                + "'22/06', '12:00', 15, 2)";
                statement.executeUpdate(sqlInsert); 

                
                //insert a Seat to showtime table
                for(int y = 1; y < 5; y++){        
                    for(int x = 1; x < 5; x++){
                        sqlInsert = "insert into " + seatTable + "(Column1, Row, Available, Showtime_id) values( "
                            + x + ", " + y + ", true, 1)";
                        statement.executeUpdate(sqlInsert); 
                    }
                }
                //insert a Seat to showtime table
                for(int y = 1; y < 5; y++){        
                    for(int x = 1; x < 5; x++){
                        sqlInsert = "insert into " + seatTable + "(Column1, Row, Available, Showtime_id) values( "
                            + x + ", " + y + ", true, 2)";
                        statement.executeUpdate(sqlInsert); 
                    }
                }
                               
            }

            //statement.close();  
            addData();
            System.out.println("Table created");

        } catch (SQLException ex) {
            System.out.println("Something went wrong. Please try again");
            System.out.println(ex);
        }
    }

    public HashMap getAllMovieQuery() {
        HashMap<Integer, Movie> allMovie = new HashMap<>();
        ResultSet rs = null;

        try {

            System.out.println(" getting query....");
            Statement statement = dbManager.getConnection().createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            String sqlQuery = "select * from Movie";

            rs = statement.executeQuery(sqlQuery);
            rs.beforeFirst();
            while (rs.next()) {
                int movieid = rs.getInt("Movie_Id");
                String name = rs.getString("Name");
                int length = rs.getInt("Length");
                String castings = rs.getString("Castings");
                String director = rs.getString("Director");
                String category = rs.getString("Category");
                double rating = rs.getDouble("Rating");
                String type = rs.getString("Type");
                String description = rs.getString("Description");
                String image = rs.getString("Image");
                allMovie.put(movieid, new Movie(movieid, name, length, castings, director, category, rating, type, description, image));
            }
        } catch (SQLException ex) {
            System.out.println("Something went wrong. Please try again");
        }
         return allMovie;
    }
    
    public ArrayList getAllShowTimeQuery(int movieid) {
        ArrayList<ShowTime> showTimes = new ArrayList<>();
        ResultSet rs = null;

        try {

            System.out.println(" getting query....");
            Statement statement = dbManager.getConnection().createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            String sqlQuery = "select * from ShowTime where MOVIE_ID =" + movieid;

            rs = statement.executeQuery(sqlQuery);
            rs.beforeFirst();
            while (rs.next()) {
                int showtimeid = rs.getInt("Showtime_ID");
                String date = rs.getString("date");
                String time = rs.getString("Time");
                int price = rs.getInt("Price");
  
                showTimes.add(new ShowTime(date, time, price, showtimeid));
            }
            System.out.println(movieid);
            System.out.println(showTimes.get(0).getKey());
        } catch (SQLException ex) {
            System.out.println("Something went wrong. Please try again");
        }
         return showTimes;
    }
        
    public ArrayList getSeatQuery(int showtimeid) {
        ArrayList<Seat> seats = new ArrayList<>();
        ResultSet rs = null;

        try {
            System.out.println(" getting query....");
            Statement statement = dbManager.getConnection().createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            String sqlQuery = "select * from SEAT where showtime_id =" + showtimeid;

            rs = statement.executeQuery(sqlQuery);
            rs.beforeFirst();
            while (rs.next()) {
                int seatid = rs.getInt("SEAT_ID");
                int column = rs.getInt("Column1");
                int row = rs.getInt("Row");
                boolean available = rs.getBoolean("Available");
  
                seats.add(new Seat(seatid, available, column, row));
            }
        } catch (SQLException ex) {
            System.out.println("Something went wrong. Please try again");
        }
        
         return seats;
    }
    
    public void updateSeat(int seatid){
        ResultSet rs = null;

        try {
            System.out.println(" getting query....");
            Statement statement = dbManager.getConnection().createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            System.out.println(seatid);

            String sqlUpdateTable = "update SEAT set available = false"
                    + " where SEAT_ID = " + seatid;
            statement.executeUpdate(sqlUpdateTable);

        } catch (SQLException ex) {
            System.out.println("Something went wrong. Please try again");
        }
    }
    
        public void InsertBooking(String userid, int showtimeid, int seatid){
        ResultSet rs = null;
        
            System.out.println(userid);
            System.out.println(showtimeid);
            System.out.println(seatid);

        try {
            
            System.out.println(" getting query....");
            Statement statement = dbManager.getConnection().createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            System.out.println(userid);

            PreparedStatement sqlInsertStatement = dbManager.getConnection().prepareStatement("insert into Booking (ShowTime_id, Seat_id, User_id) values(?,?,?)"); 
            sqlInsertStatement.setInt(1, showtimeid);
            sqlInsertStatement.setInt(2, seatid);
            sqlInsertStatement.setString(3, userid);
            sqlInsertStatement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
        
    public void addData(){
        ResultSet rs = null;
        try{
            System.out.println("hi");
            Statement statement = dbManager.getConnection().createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_READ_ONLY);
            String sqlInsert = "insert into booking (showtime_id, seat_id, user_id) values (?, ?, ?)";
            PreparedStatement stmp;
            Connection conn = dbManager.getConnection();
            stmp = conn.prepareStatement(sqlInsert);
            stmp.setString(1, "1");
            stmp.setString(2, "1");
            stmp.setString(3, "234@123.com");
            stmp.executeUpdate();
        } catch (SQLException ex){
           System.out.println(ex);
        }
    }
    
    public void updateUserAfterRegister(User user){
        ResultSet rs = null;
        
        try{
            System.out.println(" getting query....");
            Statement statement = dbManager.getConnection().createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_READ_ONLY);
            
            String sqlInsert = "insert into Customer (User_id, User_name, User_password) values (?, ?, ?)";
            PreparedStatement stmp;
            Connection conn = dbManager.getConnection();
            stmp = conn.prepareStatement(sqlInsert);
            stmp.setString(1, user.getEmail());
            stmp.setString(2, user.getName());
            stmp.setString(3, user.getPassword());
            stmp.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public ArrayList getUser(){
        ArrayList<User> user = new ArrayList<>();
        ResultSet rs = null;
        
        try{
            System.out.println(" getting query....");
            Statement statement = dbManager.getConnection().createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_READ_ONLY);
            
            String sqlSelect = "select * from Customer";
            rs = statement.executeQuery(sqlSelect);
            if(rs != null){
                rs.beforeFirst();
                while (rs.next()) {
                String userId = rs.getString("User_id");
                String userName = rs.getString("User_name");
                String userPassword = rs.getString("User_password");
                user.add(new User(userId, userName, userPassword));
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return user;
    }
    
    public ArrayList<Booking> getUserBookingFromBooking(String userId){
        ArrayList<Booking> booking = new ArrayList<>();
        ResultSet rs = null;
        
        try{
            System.out.println(" getting query....");
            Statement statement = dbManager.getConnection().createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_READ_ONLY);
            
            String sqlSelect = "select * from Booking where User_id = ?";
            PreparedStatement stmp;
            Connection conn = dbManager.getConnection();
            stmp = conn.prepareStatement(sqlSelect);
            stmp.setString(1, userId);
            rs = stmp.executeQuery();
            if(rs != null){
                rs.beforeFirst();
                while (rs.next()) {
                    int booking_id = rs.getInt(1);
                    int showTime_id = rs.getInt(2);
                    int seat_id = rs.getInt(3);
                    booking.add(new Booking(booking_id, showTime_id, seat_id, userId));
                }
            }
        } catch (SQLException ex){
            System.out.println(ex);
        }
        return booking;
    }
    
    public ShowTime getUserShowTimeInfo(int showTime_id){
        ShowTime showTime = null;
        ResultSet rs = null;
        try{
            System.out.println(" getting query....");
            Statement statement = dbManager.getConnection().createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_READ_ONLY);
            
            String sqlSelect = "select * from ShowTime where ShowTime_id = ?";
            PreparedStatement stmp;
            Connection conn = dbManager.getConnection();
            stmp = conn.prepareStatement(sqlSelect);
            stmp.setInt(1, showTime_id);
            rs = stmp.executeQuery();
            if(rs != null){
                rs.beforeFirst();
                while (rs.next()) {
                    String date = rs.getString(2);
                    String time = rs.getString(3);
                    int price = rs.getInt(4);
                    int movie_id = rs.getInt(5);
                    showTime = new ShowTime(showTime_id, date, time, price, movie_id);
                }
            }
        } catch (SQLException ex){
            System.out.println(ex);
        }
        return showTime;
    }
}
