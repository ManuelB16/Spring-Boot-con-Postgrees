package com.example.post.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "user not found")
    public class UserNotFoundException extends RuntimeException {
    }
