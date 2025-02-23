package com.ecommerce.amazon.service;


import com.ecommerce.amazon.model.Category;

import java.util.List;

public interface CategoryService {
    public List<Category>getAllCategory();
    public void creatCategory(Category category);
    public  void updateCategory(String categoryId,Category category);
    public  void deletCategory(String categoryId);
    public  Category getCatgoryById(String categoryId);
    public Category getCategoryByName(String categoryName);
}
