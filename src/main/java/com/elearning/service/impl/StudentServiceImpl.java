package com.elearning.service;

import com.elearning.exception.CourseNotFoundException;
import com.elearning.model.Course;
import com.elearning.model.Student;
import com.elearning.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private CourseRepository courseRepository;


    @Override
    public Course retreiveStudentCourse(int courseId) {
        Optional<Course> course = courseRepository.findById(courseId);
        if (course.isPresent()) {
            return course.get();
        } else {
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
