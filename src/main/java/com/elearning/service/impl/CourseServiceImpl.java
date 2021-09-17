package com.elearning.service.impl;

import com.elearning.model.Course;
import com.elearning.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Slf4j
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
