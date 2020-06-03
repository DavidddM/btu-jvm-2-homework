package com.example.demo.service;

import com.example.demo.dto.*;

public interface MovieService {
    // ფილმის დამატება
    AddMovieOutput addMovie(AddMovieInput addMovieInput);
    // ფილმის წაშლა
    DeleteMovieOutput deleteMovie(DeleteMovieInput deleteMovieInput);
    // ფილმის წამოღება ID-ით
    GetMovieOutput getMovieById(GetMovieInput getMovieInput);
    // ყველა ფილმის წამოღება
    GetMoviesOutput getAllMovies(GetMoviesInput getMoviesInput);
}
