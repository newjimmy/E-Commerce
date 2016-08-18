package com.commerce.services;

import com.commerce.models.ProductsModel;
import com.commerce.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    public List<ProductsModel> getListOfProducts() {
        return productsRepository.getListOfAllProducts();
    }

    public List<ProductsModel> getListOfProductsByCategoryId(int categoryId) {
        return productsRepository.getListOfAllProductsByCategoryId(categoryId);
    }

    public void setNewProduct(ProductsModel productsModel) {
        productsRepository.addProduct(productsModel);
    }

    public List<ProductsModel> getListOfProductsByCategoryIdForFile(int categoryIdNew) {
        return productsRepository.getProductsByCategoryIdForFile(categoryIdNew);
    }

}
