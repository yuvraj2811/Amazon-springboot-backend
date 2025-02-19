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
        return categoryRepository.getAllCategory();
    }

    @Override
    public void creatCategory(Category category) {
          categoryRepository.creatCategory(category);
    }

    @Override
    public void updateCategory(int categoryId, Category category) {
      categoryRepository.updateCategory(categoryId,category);
    }

    @Override
    public void deletCategory(int categoryId) {
      categoryRepository.deletCategory(categoryId);
    }
}
