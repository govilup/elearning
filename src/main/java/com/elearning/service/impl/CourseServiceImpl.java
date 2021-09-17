package com.elearning.service;

import com.elearning.model.Course;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CourseServiceImpl implements CourseService {

    @Override
    public Boolean addCourse(Course course) {
        return null;
    }

    @Override
    public Set<Course> getCourse(String courseName, int id) {
        return null;
    }

    @Override
    public Boolean deleteCourse(int id, String courseName) {
        return null;
    }

    @Override
    public Boolean updateCourse(Course course) {
        return null;
    }
}
