package com.elearning.controller;

import com.elearning.model.LoginRequest;
import com.elearning.model.User;
import com.elearning.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping
    public ResponseEntity<User> authenticate(@Validated @RequestBody LoginRequest request){
        User loggedUser = loginService.authenticateUser(request);
        if(loggedUser != null) {
            return ResponseEntity.ok(loggedUser);
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
    }

}
