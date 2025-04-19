package com.duclong.thucung.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHanler {
    @ExceptionHandler(value =RuntimeException.class)
    ResponseEntity<String> hanLingException(RuntimeException e){
        return  ResponseEntity.badRequest().body(e.getMessage());
    }

}
