package com.expample.di.application;

public class Product {
    private final long productId;
    private final String productName;

    public Product(final long productId, final String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductName() {
        return "商品名: " + productName;
    }

}
