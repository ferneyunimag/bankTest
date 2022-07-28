package kcrs.testing.challenge.test.example.exception.DataBase;

import kcrs.testing.challenge.test.example.exception.handler.GeneraException;

import java.time.ZonedDateTime;

public class DataBaseException extends GeneraException {

    public DataBaseException(String code, String message, ZonedDateTime date) {
        super(code, message, date);
    }
}
