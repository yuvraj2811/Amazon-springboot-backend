package com.ecommerce.amazon.repository;

import com.ecommerce.amazon.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product,String> {
//    public List<Product> getAllProduct();
//    public void creatProduct(Product product);
//    public  void updateProduct(int productId,Product product);
//    public  void deletProduct(int ProductId);
    public Product findByProductName(String productName);
}
