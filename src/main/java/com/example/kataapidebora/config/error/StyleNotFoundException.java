package com.example.kataapidebora.config.error;

import java.io.Serial;

public class StyleNotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 4124675284469531845L;

    public StyleNotFoundException(Long id) { super ("Style not found with id " + id);}

}
