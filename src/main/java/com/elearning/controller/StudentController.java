package com.elearning.controller;

import com.elearning.model.Course;
import com.elearning.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/courses")
    public ResponseEntity<List<Course>> retreiveStudentCourses() {
        List<Course> courses = studentService.findAllCourses();
        if(courses.size() > 0) {
            return ResponseEntity.ok(courses);
        }
        return ResponseEntity.notFound().build();
    }


    @GetMapping("/courses/{courseId}")
    public ResponseEntity<Course> retreiveStudentCourse( @PathVariable int courseId) {
        Course course = studentService.retreiveStudentCourse(courseId);
        if(course != null) {
            return ResponseEntity.ok(course);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/courses/active")
    public ResponseEntity<List<Course>> activeCourse() {
        List<Course> courses = studentService.findActiveCourses();
        if(courses != null) {
            return ResponseEntity.ok(courses);
        }
        return ResponseEntity.notFound().build();
    }
}
