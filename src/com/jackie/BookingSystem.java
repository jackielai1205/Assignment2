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
        Model model = new Model();
        MoviePageView moviePageView = new MoviePageView();
        MoviePageController moviePageController = new MoviePageController(moviePageView, model);
    }
}