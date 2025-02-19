package com.ecommerce.amazon.repository;

import com.ecommerce.amazon.model.Product;

import java.util.List;

public interface ProductRepository {
    public List<Product> getAllProduct();
    public void creatProduct(Product product);
    public  void updateProduct(int productId,Product product);
    public  void deletProduct(int ProductId);
}
