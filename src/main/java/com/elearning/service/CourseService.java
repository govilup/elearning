package com.elearning.service;

import com.elearning.model.Course;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface CourseService {

    Boolean addCourse(Course course);

    Set<Course> getCourse(String courseName, int id);

    Boolean deleteCourse(int id, String courseName);

    Boolean updateCourse(Course course);
}
