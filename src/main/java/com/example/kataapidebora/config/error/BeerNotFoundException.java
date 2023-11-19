package com.example.kataapidebora.config.error;

import java.io.Serial;

public class BeerNotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 4124675284469531845L;

    public BeerNotFoundException(Long id) { super ("Beer not found with id " + id);}

}
