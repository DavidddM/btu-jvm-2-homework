package com.example.demo.service.impl;

import com.example.demo.dto.*;
import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import com.example.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieRepository movieRepository;

    @Override
    public AddMovieOutput addMovie(AddMovieInput addMovieInput) {
        Movie movie = new Movie();
        movie.setTitle(addMovieInput.getTitle());
        movie.setCountry(addMovieInput.getCountry());
        movieRepository.save(movie);
        AddMovieOutput addMovieOutput = new AddMovieOutput();
        addMovieOutput.setMsg("წარმატებით დაემატა");
        return addMovieOutput;
    }

    @Override
    public DeleteMovieOutput deleteMovie(DeleteMovieInput deleteMovieInput) {
        Movie movie = movieRepository.getOne(deleteMovieInput.getId());
        movieRepository.delete(movie);
        DeleteMovieOutput deleteMovieOutput = new DeleteMovieOutput();
        deleteMovieOutput.setMsg("წარმატებით წაიშალა");
        return deleteMovieOutput;
    }

    @Override
    public GetMovieOutput getMovieById(GetMovieInput getMovieInput) {
        Movie movie = movieRepository.getOne(getMovieInput.getId());
        GetMovieOutput getMovieOutput = new GetMovieOutput();
        getMovieOutput.setTitle(movie.getTitle());
        getMovieOutput.setCountry(movie.getCountry());
        return getMovieOutput;
    }

    @Override
    public GetMoviesOutput getAllMovies(GetMoviesInput getMoviesInput) {
        List<Movie> movies = movieRepository.findAll();
        GetMoviesOutput getMoviesOutput = new GetMoviesOutput();
        List<MovieDTO> movieDTOS = new ArrayList<>();
        for(Movie movie: movies) {
            MovieDTO movieDTO = new MovieDTO();
            movieDTO.setTitle(movie.getTitle());
            movieDTO.setCountry(movie.getCountry());
            movieDTOS.add(movieDTO);
        }
        getMoviesOutput.setMovies(movieDTOS);
        return getMoviesOutput;
    }
}
