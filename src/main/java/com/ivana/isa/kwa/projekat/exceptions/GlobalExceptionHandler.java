package com.ivana.isa.kwa.projekat.exceptions;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    
    @ExceptionHandler(UsernameAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleUsernameExists(Exception ex) {
        return error(ex, HttpStatus.CONFLICT, "Korisničko ime je već u upotrebi.");
    }
    
    @ExceptionHandler(EmailAlreadyInUseException.class)
    public ResponseEntity<ErrorResponse> handleEmailExists(Exception ex) {
        return error(ex, HttpStatus.CONFLICT, "Email je već u upotrebi.");
    }
    
    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<ErrorResponse> handleNotFound(Exception ex) {
        return error(ex, HttpStatus.NOT_FOUND, "Stavka nije pronadjena");
    }
    
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleError(Exception ex) {
        return error(ex, HttpStatus.INTERNAL_SERVER_ERROR, "Neočekivana greška: " + ex.getMessage());
    }
    
    private ResponseEntity<ErrorResponse> error(Exception ex, HttpStatus status, String message) {
        return ResponseEntity.status(status).body(new ErrorResponse(message, ex));
    }

    
}

class ErrorResponse {
    private final String message;
    private final Exception exception;
    
    public ErrorResponse(String message, Exception exception) {
        this.message = message;
        this.exception = exception;
    }}

