package com.MovieService.model;


import com.MovieService.model.enums.CategoryMovie;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "movies")
public class Movie {

    @Id
    private Integer id;
    private String name;
    @Column(columnDefinition = "BIT",nullable = false)
    private boolean isAvaiable;

    @Enumerated(EnumType.STRING)
    private CategoryMovie category;

    public Movie(int id, String name, CategoryMovie category, boolean isAvaiable) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.isAvaiable = isAvaiable;
    }
    public Movie() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public boolean isAvaiable() {
        return isAvaiable;
    }

    public void setAvaiable(boolean avaiable) {
        isAvaiable = avaiable;
    }
}
