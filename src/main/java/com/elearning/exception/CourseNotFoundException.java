package com.elearning.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Custom Exception to handle course not found.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class CourseNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 155523721411672670L;

    public CourseNotFoundException(String message) {
        super(message);
    }
}
