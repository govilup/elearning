package com.elearning.service;

import com.elearning.model.LoginRequest;
import com.elearning.model.User;
import com.elearning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User authenticateUser(LoginRequest request) {
        User user = userRepository.findByUsernameAndPassword(request.getUsername(), request.getPassword());
        if(user == null) {
            try {
                throw new Exception("Login Failed");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return user;
    }
}
