
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Observable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacki
 */
public class MoviePageModel extends Observable{
    private HashMap<Integer, Movie> movies;
    private ArrayList<User> users;

    public MoviePageModel() {
        this.movies = new HashMap<>();
        this.movies.put(0, new Movie("Godzialla vs Kong"));
        this.movies.put(1, new Movie("Mortal Kombat"));
        this.setChanged();
    }

    public HashMap<Integer, Movie> getMovies() {
        return movies;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
