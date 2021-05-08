package com.MovieService.Service;

import com.MovieService.model.Movie;
import com.MovieService.model.enums.CategoryMovie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    public List<Movie> findAll() {
        Movie movie1 = new Movie(1L,"Karol", CategoryMovie.ACTION);
        Movie movie2 = new Movie(2L,"Karol", CategoryMovie.COMEDY);
        Movie movie3 = new Movie(3L,"Karol", CategoryMovie.HORROR);
        List movies = new ArrayList();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        return movies;
    }

    public Optional<Movie> findById(Long id) {
        Movie movie = new Movie(id,"Karol", CategoryMovie.ACTION);
        return Optional.of(movie);
    }

    public Movie save(Movie movie) {
        System.out.println("Dodano film");
        return movie;
    }

    public Movie update(Long id, Movie movie) {
        return movie;
    }

    public void delete(Long id) {

    }
}
