package dev.al.springboot_internship.service;

import dev.al.springboot_internship.model.entity.Student;
import dev.al.springboot_internship.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String saveStudent(Student student) {
        if (studentRepository.existsStudentByName(student.getName())){
            throw new IllegalArgumentException("Student already exists");
        }
        studentRepository.save(student);
        return "Student Added successfully: " + student;
    }

    public Iterable<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public void deleteStudentById(Long id) {

        if(!studentRepository.existsById(id)) throw new IllegalArgumentException("Student cannot be deleted, it doesnt exist");

        studentRepository.deleteById(id);
    }


}
