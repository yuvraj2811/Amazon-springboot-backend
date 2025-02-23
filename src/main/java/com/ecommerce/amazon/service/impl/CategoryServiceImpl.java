package com.ecommerce.amazon.service.impl;

import com.ecommerce.amazon.model.Category;
import com.ecommerce.amazon.repository.CategoryRepository;
import com.ecommerce.amazon.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public void creatCategory(Category category) {
          categoryRepository.save(category);
    }

    @Override
    public void updateCategory(String categoryId, Category category) {
    Category  updateToCategory= getCatgoryById(categoryId);
    if (updateToCategory.getCategoryId()!=null){
        categoryRepository.save(category);
    }
    }

    @Override
    public void deletCategory(String categoryId) {
      categoryRepository.deleteById(categoryId);
    }

    @Override
    public Category getCatgoryById(String categoryId) {
        return categoryRepository.findById(categoryId).orElse(new Category());
    }

    @Override
    public Category getCategoryByName(String categoryName) {
        return categoryRepository.findByCategoryName(categoryName);
    }
}
