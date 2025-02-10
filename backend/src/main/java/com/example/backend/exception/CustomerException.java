package com.example.backend.exception;

public class CustomerException extends RuntimeException {

    public CustomerException(long id) {
        super("Impossible de trouver le customer avec id " + id);
    }


}
