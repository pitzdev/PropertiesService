package com.stayhere.controllers;

import com.stayhere.entity.Category;
import com.stayhere.exceptions.NotFoundException;
import com.stayhere.services.interfaces.CategoryService;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @GetMapping(value = "/categories")
    public List<Category> getCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping(value = "/category/{id}")
    public Category getCategoryById(@PathVariable("id") long id) {
        Category category = categoryService.findById(id)
                .orElseThrow(()->new NotFoundException("Category with "+id+" is Not Found!"));

        return category;
    }

    @PostMapping(value = "/category")
    public Category addCategory(@RequestBody Category category){
      return categoryService.save(category);
    }


}
