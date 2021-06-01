package com.jackie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacki
 */
public class MoviePageController implements ActionListener{
    
    static MoviePageView view;
    static MoviePageModel model;
    Movie movie;
   
    public MoviePageController(MoviePageModel model, MoviePageView view ){
        MoviePageController.model = model;
        MoviePageController.view = view;
        model.addObserver(view);
        model.notifyObservers(view);
    }
    
    public MoviePageController(Movie movie){
        this.movie = movie;
    }

    public MoviePageView getView() {
        return view;
    }

    public void setView(MoviePageView view) {
        MoviePageController.view = view;
    }

    public MoviePageModel getModel() {
        return model;
    }

    public void setModel(MoviePageModel model) {
        MoviePageController.model = model;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    
    //Create a next page and add controller.
    @Override
    public void actionPerformed(ActionEvent e) {
        MovieDetailPageModel movieDetailPageModel = new MovieDetailPageModel(movie, model.dbm);
        MovieDetailPageView movieDetailPageView = new MovieDetailPageView(view);
        MovieDetailPageController movieDetailPageController = new MovieDetailPageController(movieDetailPageView, movieDetailPageModel);
        movieDetailPageView.addController(movieDetailPageController);
        movieDetailPageView.addBackButton(movieDetailPageView.getBack(), new BackController(movieDetailPageView));
        view.setEnabled(false);
        view.setVisible(false);
    }
    
    public void addModel(MoviePageModel model){
        MoviePageController.model = model;
    }
    
    public void addView(MoviePageView view){
        MoviePageController.view = view;
    }

}
