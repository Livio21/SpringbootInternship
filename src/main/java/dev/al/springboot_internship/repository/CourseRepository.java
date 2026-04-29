package dev.al.springboot_internship.repository;

import dev.al.springboot_internship.model.entity.Course;
import dev.al.springboot_internship.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
    Course findById(long id);

}
