package com.ecommerce.amazon.repository;

import com.ecommerce.amazon.model.Category;

import java.util.List;

public interface CategoryRepository {
    public List<Category> getAllCategory();
    public void creatCategory(Category category);
    public  void updateCategory(int categoryId,Category category);
    public  void deletCategory(int categoryId);
}
