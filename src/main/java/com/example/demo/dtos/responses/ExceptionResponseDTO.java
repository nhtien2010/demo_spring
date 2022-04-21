package com.example.demo.dtos.responses;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter@Setter
public class ExceptionResponseDTO {
    int statusCode;
    String message;
    Instant timeStamp;
}
