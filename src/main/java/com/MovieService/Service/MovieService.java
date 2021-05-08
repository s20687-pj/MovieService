package com.MovieService.Service;

import com.MovieService.model.Movie;
import com.MovieService.model.enums.CategoryMovie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
}
