package com.elearning.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Data
@Builder
@Entity
@Table(name = "COURSE")
public class Course {
    @Id
    private Integer id;
    private String name;
    private String durationOfCourse;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private Boolean isActive;

    @ManyToMany
    @JoinTable(name = "instructor_course", joinColumns = @JoinColumn(name = "course_id",referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "instructor_id", referencedColumnName = "id"))
    private Set<Instructor> instructors;

    private List<Lesson> lessons;

    @ManyToMany
    @JoinTable(name = "student_course", joinColumns = @JoinColumn(name = "course_id",referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"))
    private List<Student> students;
}
