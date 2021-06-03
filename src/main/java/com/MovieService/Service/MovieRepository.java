package com.MovieService.Service;

import com.MovieService.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

    @Query("select m from movies m")
    List<Movie> findAll();

    @Query("select m from movies m where m.id =?1")
    Movie findById(int id);

    Movie save(Movie movie);

    @Transactional
    @Modifying
    @Query(value = "insert into movies (id, name, category) values (:#{#m.id},:#{#m.name},:#{#m.category})", nativeQuery = true)
    void save2(@Param("m") Movie movie);
    

    @Modifying
    @Query("delete movies m where m.id =?1")
    void deleteById (int id);

}
