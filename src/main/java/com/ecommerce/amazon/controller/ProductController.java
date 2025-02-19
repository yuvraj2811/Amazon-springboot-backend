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


 @GetMapping()
    public List<Product>getAllProduct(){
     return productService.getAllProduct();
 }

 @PostMapping()
    public  String creatProduct(@RequestBody Product product){
     productService.creatProduct(product);
     return "Creat Successfully";
 }

 @PutMapping("/{productId}")
    public String updateProduct( @PathVariable int productId,Product product){
     productService.updateProduct(productId,product);
     return "Update Successfully";
 }

 @DeleteMapping("/{productId}")
    public String deletProduct( @PathVariable int productId){
     productService.deletProduct(productId);
     return "Delete successfully";
 }
}
