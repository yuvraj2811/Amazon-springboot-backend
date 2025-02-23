package com.ecommerce.amazon.controller;


import com.ecommerce.amazon.model.Product;
import com.ecommerce.amazon.service.ProductService;
import com.ecommerce.amazon.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
//ProductServiceImpl productService =new ProductServiceImpl();

    @Autowired
    ProductService productService;


 @GetMapping("/all")
    public List<Product>getAllProduct(){
     return productService.getAllProduct();
 }

 @PostMapping()
    public  String creatProduct(@RequestBody Product product){
     productService.creatProduct(product);
     return "Creat Successfully";
 }

 @PutMapping("/{productId}")
    public String updateProduct( @PathVariable String productId,Product product){
     productService.updateProduct(productId,product);
     return "Update Successfully";
 }

 @DeleteMapping("/{productId}")
    public String deletProduct( @PathVariable String productId){
     productService.deletProduct(productId);
     return "Delete successfully";
 }

 @GetMapping("/{productId}")
    public Product getProductById(String productId){
     return productService.getProductById(productId);
 }

 @GetMapping("/productName")
    public Product getProductByName(@RequestParam String productName){
     return productService.getProductByName(productName);
 }
}
