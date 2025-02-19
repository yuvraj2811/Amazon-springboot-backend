package com.ecommerce.amazon.service;


import com.ecommerce.amazon.model.Category;

import java.util.List;

public interface CategoryService {
    public List<Category>getAllCategory();
    public void creatCategory(Category category);
    public  void updateCategory(int categoryId,Category category);
    public  void deletCategory(int categoryId);
}
