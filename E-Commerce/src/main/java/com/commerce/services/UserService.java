package com.commerce.services;

import com.commerce.models.UserModel;
import com.commerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DictionaryService dictionaryService;

    public void saveUserDetails(UserModel userModel) {
        int userId = userRepository.setUserDetails(userModel);
        int roleId = dictionaryService.getRoleId("ROLE_USER");
        userRepository.setUserRole(roleId, userId);
    }

}
