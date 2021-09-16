package com.elearning.model;

public class Student extends User {

    public Student(Integer id, String username, String password, String email, UserType userType) {
        super(id, username, password, email, userType);
    }
}
