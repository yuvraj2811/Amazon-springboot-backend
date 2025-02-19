package com.ecommerce.amazon.service.impl;

import com.ecommerce.amazon.model.Product;
import com.ecommerce.amazon.repository.ProductRepository;
import com.ecommerce.amazon.repository.impl.ProductRepositoryImpl;
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
        return productRepository.getAllProduct();
    }

    @Override
    public void creatProduct(Product product) {
      productRepository.creatProduct(product);
    }

    @Override
    public void updateProduct(int productId, Product product) {
productRepository.updateProduct(productId,product);
    }

    @Override
    public void deletProduct(int productId) {
     productRepository.deletProduct(productId);
    }
}
