package com.jackie;

import com.jackie.MoviePageModel;
import com.jackie.MoviePageModel;
import com.jackie.View;
import com.jackie.View;
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
    
    static View view;
    static MoviePageModel model;
    Movie movie;
   
    public MoviePageController(MoviePageModel model, View view ){
        this.model = model;
        this.view = view;
        model.addObserver(view);
        model.notifyObservers(view);
    }
    
    public MoviePageController(Movie movie){
        this.movie = movie;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
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

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        MovieDetailPageModel movieDetailPageModel = new MovieDetailPageModel(movie);
        MovieDetailPageView movieDetailPageView = new MovieDetailPageView(view);
        MovieDetailPageController movieDetailPageController = new MovieDetailPageController(movieDetailPageView, movieDetailPageModel);
        movieDetailPageView.addController(movieDetailPageController);
        movieDetailPageView.addBackButton(movieDetailPageView.getBack(), new BackController(movieDetailPageView));
        view.setEnabled(false);  
    }
    
    public void addModel(MoviePageModel model){
        this.model = model;
    }
    
    public void addView(View view){
        this.view = view;
    }
}
