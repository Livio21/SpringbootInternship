package dev.al.springboot_internship.mapper;

import dev.al.springboot_internship.model.dto.StudentDTO;
import dev.al.springboot_internship.model.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    public StudentDTO toDTO(Student student){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setName(student.getName());
        studentDTO.setEmail(student.getEmail());
        studentDTO.setBirthDate(student.getBirthDate());
        studentDTO.setPhoneNumber(student.getPhoneNumber());
        studentDTO.setPoints(student.getPoints());
        return studentDTO;
    }


    public Student toEntity(StudentDTO studentDTO){
        Student student = new Student();
        student.setId(studentDTO.getId());
        student.setName(studentDTO.getName());
        student.setEmail(studentDTO.getEmail());
        student.setBirthDate(studentDTO.getBirthDate());
        student.setPhoneNumber(studentDTO.getPhoneNumber());
        student.setPoints(studentDTO.getPoints());
        return student;
    }

}
