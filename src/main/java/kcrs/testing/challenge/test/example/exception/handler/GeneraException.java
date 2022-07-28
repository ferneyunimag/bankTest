package kcrs.testing.challenge.test.example.exception.handler;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;
@Getter
@Setter
public class GeneraException extends RuntimeException{
    private  String code;
    private String message;
    private ZonedDateTime date;

    public GeneraException(String code, String message, ZonedDateTime date) {
        this.code = code;
        this.message = message;
        this.date = date;
    }
}
