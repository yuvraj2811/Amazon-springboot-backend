package com.ecommerce.amazon.service.impl;

import com.ecommerce.amazon.model.Product;
import com.ecommerce.amazon.repository.ProductRepository;

import com.ecommerce.amazon.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
   // ProductRepositoryImpl productRepository=new ProductRepositoryImpl();
@Autowired
    ProductRepository productRepository;
    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public void creatProduct(Product product) {
      productRepository.save(product);
    }

    @Override
    public void updateProduct(String productId, Product product) {
     Product updateToProduct= getProductById(productId);
     if (updateToProduct.getProductId()!=null){
         productRepository.save(product);
     }
    }

    @Override
    public void deletProduct(String productId) {
     productRepository.deleteById(productId);
    }

    @Override
    public Product getProductById(String productId) {
        return productRepository.findById(productId).orElse(new Product());
    }

    @Override
    public Product getProductByName(String productName) {
        return productRepository.findByProductName(productName);
    }
}
