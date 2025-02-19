package com.ecommerce.amazon.service;

import com.ecommerce.amazon.model.Product;

import java.util.List;

public interface ProductService {

    public List<Product>getAllProduct();
    public void creatProduct(Product product);
    public  void updateProduct(int productId,Product product);
    public  void deletProduct(int productId);
}
