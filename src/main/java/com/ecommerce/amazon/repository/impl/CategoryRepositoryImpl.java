package com.ecommerce.amazon.repository.impl;

import com.ecommerce.amazon.model.Category;
import com.ecommerce.amazon.repository.CategoryRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {
    private List<Category>categories=new ArrayList<>();

  CategoryRepositoryImpl(){
      categories.add(new Category(1,"Mobile"));
      categories.add(new Category(2,"Laptop"));
  }



    @Override
    public List<Category> getAllCategory() {
        return categories;
    }

    @Override
    public void creatCategory(Category category) {
             categories.add(category);
    }

    @Override
    public void updateCategory(int categoryId, Category category) {
    for (int i=0;i<categories.size();i++){
        if (categories.get(i).getCategoryId()==categoryId){
            categories.set(i,category);
        }
    }
    }

    @Override
    public void deletCategory(int categoryId) {
     for (int i=0;i<categories.size();i++){
         if (categories.get(i).getCategoryId()==categoryId){
             categories.remove(i);
         }
     }
    }
}
