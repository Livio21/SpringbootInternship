package dev.al.springboot_internship.controller;

import dev.al.springboot_internship.model.entity.Course;
import dev.al.springboot_internship.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public Iterable<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("/course/{id}")
    public Course getCourseById(@PathVariable Long id){
        return courseService.getCourseById(id);
    }


    @PostMapping("/add-course")
    public Course createCourse(@RequestBody Course course){
        return courseService.saveCourse(course);
    }

    @DeleteMapping("/remove-course/{id}")
    public void deleteCourse(@PathVariable Long id){
        courseService.deleteCourseById(id);
    }
    
    
}
