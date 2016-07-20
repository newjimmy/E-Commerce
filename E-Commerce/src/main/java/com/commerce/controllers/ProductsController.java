package com.commerce.controllers;

import com.commerce.models.ProductsModel;
import com.commerce.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping(value = "/allproducts")
    public String getAllProductsPage() {
        return "allProducts";
    }

    @RequestMapping(value = "/loadListOfAllProductsByCategoryId", method = RequestMethod.GET)
    @ResponseBody
    public List<ProductsModel> loadListOfAllProductsByCategoryId(@RequestParam int categoryId) {
        return productsService.getListOfProductsByCategoryId(categoryId);
    }

    @RequestMapping(value = "/byid")
    public String getAllProductsByCategoryId() {
        return "allCategoriesById";
    }
}
