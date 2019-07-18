package com.expample.di.application;

public class ProductRepositoryImpl {
    public Product findById(final long productId) {
        return new Product(productId, "おすすめ商品");
    }
}
