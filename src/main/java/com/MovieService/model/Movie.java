package com.MovieService.model;


import com.MovieService.model.enums.CategoryMovie;

import java.util.Date;

public class Movie {

    private Long id;
    private String name;
    private CategoryMovie category;

    public Movie(Long id, String name, CategoryMovie category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryMovie getCategory() {
        return category;
    }

    public void setCategory(CategoryMovie category) {
        this.category = category;
    }
}
