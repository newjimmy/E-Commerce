package com.commerce.services;

import com.commerce.models.UserModel;
import com.commerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUserDetails(UserModel userModel) {
        userRepository.setUserDetails(userModel);
    }

}
