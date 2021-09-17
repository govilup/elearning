package com.elearning.service;

import com.elearning.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    /**
     * Find student course
     *
     * @param courseId of the course
     * @return Course
     */
    Course retreiveStudentCourse(int courseId);

    /**
     * Find all the courses.
     *
     * @return List of all courses
     */
    List<Course> findAllCourses();

    /**
     * Find Active courses
     *
     * @return List of active courses
     */
    List<Course> findActiveCourses();

}
