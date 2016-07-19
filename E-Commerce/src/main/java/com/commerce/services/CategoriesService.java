package com.commerce.services;

import com.commerce.models.CategoriesModel;
import com.commerce.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesService {

    @Autowired
    private CategoriesRepository categoriesRepository;

    public List<CategoriesModel> getListOfCategories() {
        return categoriesRepository.getListOfAllCategories();
    }

}
