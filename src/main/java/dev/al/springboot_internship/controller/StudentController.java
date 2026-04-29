package dev.al.springboot_internship.controller;

import dev.al.springboot_internship.exceptions.ExtraExceptions;
import dev.al.springboot_internship.mapper.StudentMapper;
import dev.al.springboot_internship.model.dto.StudentDTO;
import dev.al.springboot_internship.model.entity.Student;
import dev.al.springboot_internship.service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
class StudentController {

    //    @Autowired
    private final StudentService studentService;

    //    @Autowired
    private final StudentMapper studentMapper;

    public StudentController(StudentService studentService, StudentMapper studentMapper) {
        this.studentService = studentService;
        this.studentMapper = studentMapper;
    }


    @GetMapping("/students")
    public Iterable<StudentDTO> getAllStudents() {
        Iterable<Student> students = studentService.getAllStudents();

        List<StudentDTO> studentDTOS = new ArrayList<>();
        students.forEach(student -> {
            StudentDTO dto = studentMapper.toDTO(student);
            studentDTOS.add(dto);
        });

        return studentDTOS;
    }

    @GetMapping("/student/{id}")
//    @ResponseStatus(HttpStatus.FOUND)
    public StudentDTO getStudentById(@PathVariable Long id) throws ExtraExceptions.StudentNotFoundException {
        Student student = studentService.getStudentById(id);
        return studentMapper.toDTO(student);
    }


    @PostMapping("/add-student")
    @ResponseStatus(HttpStatus.CREATED)
    public StudentDTO createStudent(@RequestBody StudentDTO studentDTO) throws ExtraExceptions.StudentAlreadyExistsException {
        Student student = studentMapper.toEntity(studentDTO);
        Student savedStudent = studentService.saveStudent(student);
        return studentMapper.toDTO(savedStudent);
    }

    @DeleteMapping("/remove-student/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudent(@PathVariable Long id) throws ExtraExceptions.StudentNotFoundException {
        studentService.deleteStudentById(id);
    }

}
