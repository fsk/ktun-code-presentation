package com.ktun.crudapp.exception.studentexceptions;

import com.ktun.crudapp.exception.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class StudentExceptions extends ResponseEntityExceptionHandler {

    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<Object> handleStudentNotFound(StudentNotFoundException exception) {
        ExceptionResponse response = new ExceptionResponse();
        response.setExceptionMessage("Student Not Found");
        response.setExceptionDateTime(LocalDateTime.now());
        ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        return entity;
    }

    @ExceptionHandler(EmailAlreadyExistException.class)
    public ResponseEntity<Object> handleEmployeeAlreadyExists(EmailAlreadyExistException exception) {
        ExceptionResponse response = new ExceptionResponse();
        response.setExceptionMessage("Email Already Exists.!!");
        response.setExceptionDateTime(LocalDateTime.now());
        ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);
        return entity;
    }
}
