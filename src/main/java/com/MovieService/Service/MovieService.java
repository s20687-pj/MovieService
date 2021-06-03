package com.MovieService.Service;

import com.MovieService.Repository.MovieRepository;
import com.MovieService.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    public Movie findById(int id) {
        return movieRepository.findById(id);
//                .orElseThrow(MovieNotFoundException::new);
    }

    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie update(Long id, Movie movie) {
        return movieRepository.save(movie);
    }

    public void delete(int id) {
        movieRepository.deleteById(id);
    }

    public void save2(Movie movie) {
        movieRepository.save2(movie);
    }
}
