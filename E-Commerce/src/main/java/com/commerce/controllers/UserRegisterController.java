package com.commerce.controllers;

import com.commerce.models.UserModel;
import com.commerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/register")
public class UserRegisterController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String viewRegistration(Model model) {
        UserModel userModel = new UserModel();
        model.addAttribute("userModel", userModel);
        return "registration";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submitRegistration(@ModelAttribute("userModel") UserModel userModel, BindingResult result) {
        userService.saveUserDetails(userModel);
        return "registrationSuccess";
    }
}
