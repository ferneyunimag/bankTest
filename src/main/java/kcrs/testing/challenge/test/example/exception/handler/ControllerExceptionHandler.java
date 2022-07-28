package kcrs.testing.challenge.test.example.exception.handler;

import kcrs.testing.challenge.test.example.exception.DataBase.DataBaseException;
import kcrs.testing.challenge.test.example.exception.services.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(value = {DataBaseException.class})
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponse> badRequest(GeneraException e) {
        ErrorResponse errorResponse = new ErrorResponse(e.getCode(), e.getMessage(), e.getDate());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = {NotFoundException.class})
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorResponse> notFoundException(GeneraException e) {
        ErrorResponse errorResponse = new ErrorResponse(e.getCode(), e.getMessage(), e.getDate());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

}
