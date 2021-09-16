package com.elearning.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class Course {
    private Integer id;
    private String name;
    private String durationOfCourse;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private Boolean isActive;
    private Instructor instructor;
    private List<Lesson> lessons;
    private List<Student> students;
}
