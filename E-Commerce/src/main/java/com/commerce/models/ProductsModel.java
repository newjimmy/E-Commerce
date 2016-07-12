package com.commerce.models;

public class ProductsModel {
    private int productId;
    private int productArea;
    private int productPrice;
    private int productYear;
    private int productRoomsNumber;
    private String productLocation;

    public ProductsModel(int productId, int productArea, int productPrice, int productYear, int productRoomsNumber, String productLocation) {
        this.productId = productId;
        this.productArea = productArea;
        this.productPrice = productPrice;
        this.productYear = productYear;
        this.productRoomsNumber = productRoomsNumber;
        this.productLocation = productLocation;
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
}