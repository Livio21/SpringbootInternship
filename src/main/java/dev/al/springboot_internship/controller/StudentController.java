package dev.al.springboot_internship.controller;

import dev.al.springboot_internship.exceptions.ExtraExceptions;
import dev.al.springboot_internship.model.entity.Student;
import dev.al.springboot_internship.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public Iterable<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable Long id) throws ExtraExceptions.StudentNotFoundException {
        return studentService.getStudentById(id);
    }


    @PostMapping("/add-student")
    public String createStudent(@RequestBody Student student) throws ExtraExceptions.StudentAlreadyExistsException {
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/remove-student/{id}")
    public void deleteStudent(@PathVariable Long id) throws ExtraExceptions.StudentNotFoundException {
        studentService.deleteStudentById(id);
    }

}
