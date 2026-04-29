package dev.al.springboot_internship.service;

import dev.al.springboot_internship.model.entity.Student;

public interface StudentService {

    Student saveStudent(Student student);

    Iterable<Student> getAllStudents();

    Student getStudentById(Long id);

    void deleteStudentById(Long id);

}
