package com.kodilla.good.patterns.challenges;

public class Product {
    private String productName;
    private String productType;
    private Product productID;

    public Product(String productName, String productType, Product productID) {
        this.productName = productName;
        this.productType = productType;
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Product getProductID() {
        return productID;
    }

    public void setProductID(Product productID) {
        this.productID = productID;
    }
}
