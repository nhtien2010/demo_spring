package com.example.demo.exceptions;

import com.example.demo.dtos.responses.ExceptionResponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.handler.ResponseStatusExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler  {
    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

//    @ExceptionHandler(value = {ClassNotFoundException.class})
//    public final ResponseEntity<ExceptionResponseDTO> handleBadRequestException(Exception ex, Request request) {
//
//        ExceptionResponseDTO responseDto =
//                new ExceptionResponseDTO();
//
//        return new ResponseEntity<>(responseDto, HttpStatus.valueOf(400));
//    }

    @ExceptionHandler(value = {RuntimeException.class})
    protected ResponseEntity<Object> handleRemainExceptions(RuntimeException ex){
        logger.error("Remain exception : {}", ex.getMessage());
        return new ResponseEntity<>(ex, HttpStatus.valueOf(400));
    }


}
