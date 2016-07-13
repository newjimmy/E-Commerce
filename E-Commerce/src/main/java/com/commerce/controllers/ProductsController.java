package com.commerce.controllers;

import com.commerce.models.ProductsModel;
import com.commerce.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @RequestMapping(value = "/loadListOfAllProducts", method = RequestMethod.GET)
    @ResponseBody
    public List<ProductsModel> loadListOfAllProducts() {
        return productsService.getListOfProducts();
    }

}
