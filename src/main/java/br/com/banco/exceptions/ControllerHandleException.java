package br.com.banco.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ControllerHandleException {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<?> handle(CustomException exception) {
        ApplicationErrors applicationError = new ApplicationErrors(
                exception.getMessage(),
                exception.getStatus().value(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(applicationError, exception.getStatus());
    }
}
