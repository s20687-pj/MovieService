package com.MovieService.Excepion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.function.Supplier;

public class MovieNotFoundException extends RuntimeException {
    public MovieNotFoundException() { super("nie znaleziono filmu");};
}
