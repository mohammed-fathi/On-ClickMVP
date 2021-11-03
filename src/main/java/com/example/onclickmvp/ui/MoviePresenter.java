package com.example.onclickmvp.ui;

import com.example.onclickmvp.pojo.MovieModel;

public class MoviePresenter {
    MovieView view;

    public MoviePresenter(MovieView view) {
        this.view = view;
    }

    public MovieModel getMovieFromDatabase(){
        return new MovieModel("Avengers Infinity","2018","very nice",18);
    }

    public void getMovieName(){
        view.onGetMovieName(getMovieFromDatabase().getName());
    }

}
