package dev.al.springboot_internship.repository;

import dev.al.springboot_internship.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {


    List<Student> findByLastName(String lastName);

    Student findById(long id);

}
