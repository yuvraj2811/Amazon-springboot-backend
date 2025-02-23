package com.ecommerce.amazon.service;

import com.ecommerce.amazon.model.Product;

import java.util.List;

public interface ProductService {

    public List<Product>getAllProduct();
    public void creatProduct(Product product);
    public  void updateProduct(String productId,Product product);
    public  void deletProduct(String productId);
    public  Product getProductById(String productId);
    public Product getProductByName(String productName);


}
