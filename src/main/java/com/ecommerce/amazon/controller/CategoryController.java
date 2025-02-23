package com.ecommerce.amazon.controller;


import com.ecommerce.amazon.model.Category;
import com.ecommerce.amazon.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("all")
    public List<Category>getAllCategory(){
        return categoryService.getAllCategory();
    }

    @PostMapping
    public String creatCategory(@RequestBody Category category){
           categoryService.creatCategory(category);
        return "Creat Successfully";
    }

    @PutMapping("/{categoryId}")
    public  String updateCategory(@PathVariable String categoryId,@RequestBody Category category){
       categoryService.updateCategory(categoryId,category);
        return "Update Successfully";
    }

    @DeleteMapping("/{categoryId}")
    public  String deletCategory(@PathVariable String categoryId){
      categoryService.deletCategory(categoryId);
        return "Delet Successfully";
    }

    @GetMapping("/{categoryId}")
    public Category getCategoryById(@PathVariable String categoryId){

        return categoryService.getCatgoryById(categoryId);
    }

    @GetMapping("/categoryName")
    public  Category getCategoryByName(@RequestParam String categoryName){
        return categoryService.getCategoryByName(categoryName);
    }

}
