package com.api.blog.service.exception;

import org.springframework.http.HttpStatus;

/**
 * Custom exception for blog not found scenarios
 */
public class BlogNotFoundException extends RuntimeException {
    
	private static final long serialVersionUID = 1L;
	
	private final HttpStatus status = HttpStatus.NOT_FOUND;

    public BlogNotFoundException(String message) {
        super(message);
    }

    public HttpStatus getStatus() {
        return status;
    }
}