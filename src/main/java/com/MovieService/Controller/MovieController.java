package com.MovieService.Controller;


import com.MovieService.Service.MovieService;
import com.MovieService.model.Movie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class MovieController {

    private MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> findAll(){
        return ResponseEntity.ok(movieService.findAll());
    }
    @GetMapping ("movies/{id}")
    public ResponseEntity <Movie> findAll(@PathVariable int id){
        Optional<Movie> byId = Optional.ofNullable(movieService.findById(id));
        if(byId.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(byId.get());
    }
    // 3D
    @PostMapping ("movies")
    public ResponseEntity <Movie> addMovie(@RequestBody Movie movie){
        return ResponseEntity.ok(movieService.save(movie));
    }

    //3E
    @PutMapping("movies/{id}")
    public ResponseEntity <Movie> updateMovie(@PathVariable Long id, @RequestBody Movie movie){
        return ResponseEntity.ok(movieService.update(id, movie));
    }

    //3F
    @DeleteMapping("movies/{id}")
    public ResponseEntity<String> deleteMovie(@PathVariable int id){
        movieService.delete(id);
        return ResponseEntity.ok("Usunięto");
    }

    @PostMapping ("moviestest")
    public ResponseEntity <String> addMovietest(@RequestBody Movie movie){
        movieService.save2(movie);
        return ResponseEntity.ok("Dodano");
    }

//    // zmiana wartosci isAvaiable na true
//    @PostMapping ("movies/avaiable/{id}")
//    public ResponseEntity <Movie> isAvaiable(@PathVariable int id){
//        Movie movie =  movieService.findById(id);
//        movie.setAvaiable(true);
//        return ResponseEntity.ok(movieService.save(movie));
//    }

}
