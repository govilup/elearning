package com.elearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/instructor")
public class InstructorController {

    @GetMapping
    public String test() {
        return "Successful";
    }
}
