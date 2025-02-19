package com.ecommerce.amazon.repository.impl;

import com.ecommerce.amazon.model.Product;
import com.ecommerce.amazon.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private List<Product> products=new ArrayList<>();

    public ProductRepositoryImpl(){
        products.add(new Product(1,"Tata Salt",23,4));
        products.add(new Product(2,"Nirma Detergent",45,9));
    }

    @Override
    public List<Product> getAllProduct() {
        return products;
    }

    @Override
    public void creatProduct(Product product) {
       products.add(product);
    }

    @Override
    public void updateProduct(int productId, Product product) {
   for (int i=0;i<products.size();i++){
    if (products.get(i).getProductId()==productId){
        products.set(i,product);
    }
   }
    }

    @Override
    public void deletProduct(int productId) {
for (int i=0;i<products.size();i++){
    if (products.get(i).getProductId()==productId){
        products.remove(i);
        break;
    }
      }
    }
}
