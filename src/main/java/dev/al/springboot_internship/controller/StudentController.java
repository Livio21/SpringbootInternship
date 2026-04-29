package dev.al.springboot_internship.controller;

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
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @PostMapping("/add-student")
    public Student createStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/remove-student/{id}")
    public void deleteStudnet(@PathVariable Long id){
        studentService.deleteStudentById(id);
    }

}
