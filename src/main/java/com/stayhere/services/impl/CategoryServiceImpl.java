package com.stayhere.services.impl;

import com.stayhere.entity.Category;
import com.stayhere.repositories.CategoryRepo;
import com.stayhere.services.interfaces.CategoryService;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

  private final CategoryRepo categoryRepo;


  public CategoryServiceImpl(CategoryRepo categoryRepo) {
    this.categoryRepo = categoryRepo;
  }


  @Override
  public List<Category> getAllCategories() {
    return categoryRepo.findAll();
  }

  @Override
  public Category save(Category category) {
    return categoryRepo.save(category);
  }

  @Override
  public Optional<Category> findById(Long id) {
    return categoryRepo.findById(id);
  }
}
