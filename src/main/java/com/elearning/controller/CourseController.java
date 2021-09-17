package com.elearning.controller;

import com.elearning.model.Course;
import com.elearning.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    public ResponseEntity<String> addCourse(@RequestBody Course course) {
        if(course == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please check the request.");
        }

        Boolean isAdded = courseService.addCourse(course);
        if(isAdded) {
            return ResponseEntity.status(HttpStatus.CREATED).body("New Course Added");
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal Server Issue");
    }

    @GetMapping("/{id}/{courseName}")
    public ResponseEntity<Set<Course>> getCourse(@PathVariable int id, @PathVariable String courseName) {

        Set<Course> courses = courseService.getCourse(courseName, id);
        if(courses != null) {
            return ResponseEntity.ok(courses);
        }
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<String> updateCourse(@RequestBody Course course) {
        if(course == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please check the request.");
        }

        Boolean isUpdated = courseService.updateCourse(course);
        if(isUpdated) {
            return ResponseEntity.ok().body("Course Updated");
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal Server Issue");
    }

    @DeleteMapping("/{id}/{name}")
    public ResponseEntity<String> removeCourse(@PathVariable Integer id, @PathVariable String name) {
        if(id == null || name.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please check the request.");
        }

        Boolean isDeleted = courseService.deleteCourse(id, name);
        if(isDeleted) {
            return ResponseEntity.ok().body("Course Deleted " + name);
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal Server Issue");
    }

}
