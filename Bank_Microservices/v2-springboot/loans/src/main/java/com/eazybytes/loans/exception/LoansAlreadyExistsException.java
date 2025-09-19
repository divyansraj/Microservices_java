package com.eazybytes.loans.exception;

public class LoansAlreadyExistsException extends RuntimeException {
    public LoansAlreadyExistsException(String message) {
        super(message);
    }
}
