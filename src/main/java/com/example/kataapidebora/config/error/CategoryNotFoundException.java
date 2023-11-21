package com.example.kataapidebora.config.error;

import java.io.Serial;

public class CategoryNotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 4124675284469531845L;

    public CategoryNotFoundException(Long id) { super ("Category not found with id " + id);}

}
