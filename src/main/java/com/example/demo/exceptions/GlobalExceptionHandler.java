package com.example.demo.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.handler.ResponseStatusExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
//@RestController
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler  {

    @ExceptionHandler(value = {RuntimeException.class})
    protected ResponseEntity<Object> handleRemainExceptions(RuntimeException ex){
        return null;
    }
}
