package com.commerce.models;

public class ProductsModel {
    private int productId;
    private int productArea;
    private int productPrice;
    private int productYear;
    private int productRoomsNumber;
    private String productLocation;
    private String productDescription;
    private int categoryId;

    public ProductsModel(int productId, int productArea, int productPrice, int productYear, int productRoomsNumber, String productLocation, String productDescription) {
        this.productId = productId;
        this.productArea = productArea;
        this.productPrice = productPrice;
        this.productYear = productYear;
        this.productRoomsNumber = productRoomsNumber;
        this.productLocation = productLocation;
        this.productDescription = productDescription;
    }


    public ProductsModel() {

    }


    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductArea() {
        return productArea;
    }

    public void setProductArea(int productArea) {
        this.productArea = productArea;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductYear() {
        return productYear;
    }

    public void setProductYear(int productYear) {
        this.productYear = productYear;
    }

    public int getProductRoomsNumber() {
        return productRoomsNumber;
    }

    public void setProductRoomsNumber(int productRoomsNumber) {
        this.productRoomsNumber = productRoomsNumber;
    }

    public String getProductLocation() {
        return productLocation;
    }

    public void setProductLocation(String productLocation) {
        this.productLocation = productLocation;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
}