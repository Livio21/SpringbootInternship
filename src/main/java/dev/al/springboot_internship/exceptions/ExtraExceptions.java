package dev.al.springboot_internship.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class ExtraExceptions {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public static class StudentNotFoundException extends RuntimeException {
        public StudentNotFoundException(Long id) {
            super("Student with id:"+ id + " doesnt exist.");
        }
    }
    @ResponseStatus(HttpStatus.CONFLICT)
    public static class StudentAlreadyExistsException extends RuntimeException {
        public StudentAlreadyExistsException(String name) {
            super("Student with name "+name+ " already exists");
        }
    }

}
