package com.kodilla.good.patterns.food2Door;

class Product {
    private String productName;
    private String productType;
    private String productID;

    public Product(String productName, String productType, String productID) {
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

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }
}
