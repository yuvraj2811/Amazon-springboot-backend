package com.ecommerce.amazon.repository;

import com.ecommerce.amazon.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CategoryRepository extends MongoRepository<Category,String> {
//    public List<Category> getAllCategory();
//    public void creatCategory(Category category);
//    public  void updateCategory(int categoryId,Category category);
//    public  void deletCategory(int categoryId);
    public  Category findByCategoryName(String categoryName);
}
