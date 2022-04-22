package com.example.demo.exceptions;

import com.example.demo.dtos.responses.ExceptionResponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.server.handler.ResponseStatusExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.Instant;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler  {
    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = {BadRequestException.class})
    //@ResponseStatus(HttpStatus.BAD_REQUEST)
    public final ResponseEntity<ExceptionResponseDTO> handleBadRequestException(Exception ex, WebRequest request) {
        HttpStatus status = HttpStatus.BAD_REQUEST;
        ExceptionResponseDTO responseDto =
                new ExceptionResponseDTO(status.value(), ex.getMessage(), Instant.now());

        return new ResponseEntity<>(responseDto, status);
    }

    @ExceptionHandler(value = {RuntimeException.class})
    protected ResponseEntity<Object> handleRemainExceptions(RuntimeException ex){
        logger.error("Remain exception : {}", ex.getMessage());
        return new ResponseEntity<>(ex, HttpStatus.valueOf(400));
    }


}
