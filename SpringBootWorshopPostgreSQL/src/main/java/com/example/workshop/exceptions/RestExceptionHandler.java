package com.example.workshop.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.yaml.snakeyaml.constructor.DuplicateKeyException;

import java.util.NoSuchElementException;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler
    protected ResponseEntity<ErrorResponse> handleException(NoSuchElementException exc){
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
        return buildResponseEntity(httpStatus, exc);
    }

    private ResponseEntity<ErrorResponse> buildResponseEntity(HttpStatus httpStatus, NoSuchElementException exc) {
    }
    @ExceptionHandler
    protected ResponseEntity<ErrorResponse> handleException(DuplicateKeyException exc){
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
        return buildResponseEntity(httpStatus, exc);
    }
    @ExceptionHandler
    protected ResponseEntity<ErrorResponse> handleException(IllegalArgumentException exc) {
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
        return buildResponseEntity(httpStatus, exc);
    }
}
