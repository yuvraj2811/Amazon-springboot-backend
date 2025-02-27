package com.ecommerce.amazon.repository;

import com.ecommerce.amazon.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ProductRepository extends MongoRepository<Product,String> {
//    public List<Product> getAllProduct();
//    public void creatProduct(Product product);
//    public  void updateProduct(int productId,Product product);
//    public  void deletProduct(int ProductId);


    public Optional<Product>  findByProductName(String productName);
//
//    public boolean  existsByProductName(String productName);
//
//    public List<Product>  findByProductNameContaining(String productName);//give all who contain productName abc
//    public List<Product>  findByProductNameStartingWith(String productName);//give all who contain productName starts with abc
//    public List<Product>  findByProductNameEndingWith(String productName);//give all who contain productName ends with abc
//
//    public Optional<Product>  findByProductNameAndProductType(String productName,String productType);
//
//    public List<Product> findAllByCreatedDate(Date date);
//    public List<Product> findAllByCreatedDateAfter(Date date);
//    public List<Product> findAllByCreatedDateBefore(Date date);
//    public List<Product> findAllByCreatedDateGreaterThanEqual(Date date);
//    public List<Product> findAllByCreatedDatelessThanEqual(Date date);
//    public List<Product> findAllByCreatedDateBetween(Date fromdate,Date toDate);
//    public List<Product> findAllByProductPriceGreaterThan(double productPrice);
//
//    public List<Product>findBySizeIn(String size);
    //counts
    //exists
}
