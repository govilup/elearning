package com.elearning.service.impl;

import com.elearning.exception.CourseNotFoundException;
import com.elearning.model.Course;
import com.elearning.repository.CourseRepository;
import com.elearning.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

    @Autowired
    private CourseRepository courseRepository;


    @Override
    public Course retreiveStudentCourse(int courseId) {
        Optional<Course> course = courseRepository.findById(courseId);
        if (course.isPresent()) {
            return course.get();
        } else {
            log.error("Requested course with course id " + courseId + "is not present.");
            throw new CourseNotFoundException("Course not found");
        }
    }

    @Override
    public List<Course> findAllCourses() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public List<Course> findActiveCourses() {
        return courseRepository.findByActiveTrue();
    }
}
