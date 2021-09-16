package com.elearning.service;

import com.elearning.model.LoginRequest;
import com.elearning.model.User;

public interface LoginService {

    User authenticateUser(LoginRequest request);
}
