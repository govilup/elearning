package com.elearning.model;

import javax.persistence.OneToMany;
import java.util.Set;

public class Instructor extends User {

    @OneToMany(mappedBy = "instructor")
    private Set<Tag> tags;

    public Instructor(Integer id, String username, String password, String email, UserType userType) {
        super(id, username, password, email, userType);
    }
}
