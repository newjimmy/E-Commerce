package com.commerce.controllers;

import com.commerce.models.CategoriesModel;
import com.commerce.services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CategoriesController {

    @Autowired
    private CategoriesService categoriesService;

    @RequestMapping(value = "/loadListOfAllCategories", method = RequestMethod.GET)
    public List<CategoriesModel> loadListOfAllCategories() {
        return categoriesService.getListOfCategories();
    }

}
