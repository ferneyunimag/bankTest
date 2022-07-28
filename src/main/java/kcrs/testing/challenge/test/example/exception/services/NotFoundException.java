package kcrs.testing.challenge.test.example.exception.services;

import kcrs.testing.challenge.test.example.exception.handler.GeneraException;

import java.time.ZonedDateTime;

public class NotFoundException extends GeneraException {
    public NotFoundException(String code, String message, ZonedDateTime date) {
        super(code, message, date);
    }
}
