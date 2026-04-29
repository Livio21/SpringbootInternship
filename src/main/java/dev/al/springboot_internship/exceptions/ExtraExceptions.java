package dev.al.springboot_internship.exceptions;

public class ExtraExceptions {

    public static class StudentNotFoundException extends Exception {
        public StudentNotFoundException(String msg) {
            super(msg);
        }
    }

    public static class StudentAlreadyExistsException extends Exception {
        public StudentAlreadyExistsException(String msg) {
            super(msg);
        }
    }

}
