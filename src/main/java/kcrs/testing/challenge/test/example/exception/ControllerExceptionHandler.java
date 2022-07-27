package kcrs.testing.challenge.test.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(value = {})
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ResponseEntity<GeneraException> badRequest(){

    }

    @ExceptionHandler(value = {})
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ResponseEntity<GeneraException> notFoundException(){

    }

}
