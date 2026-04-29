package dev.al.springboot_internship.repository;

import dev.al.springboot_internship.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findById(long id);

//    boolean existsStudentByName(String name);
    boolean existsStudentByNameIgnoreCase(String name);



}
