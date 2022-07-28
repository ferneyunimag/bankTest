package kcrs.testing.challenge.test.example.exception.services;

import kcrs.testing.challenge.test.example.exception.handler.GeneraException;

import java.time.ZonedDateTime;

public class AlreadyExistException extends GeneraException {

    public AlreadyExistException(String code, String message, ZonedDateTime date) {
        super(code, message, date);
    }
}
