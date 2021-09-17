package com.elearning.exception;

import org.springframework.stereotype.Component;

@Component
public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String errorMessage) {
        super(errorMessage);
    }

}
