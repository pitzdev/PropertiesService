package com.stayhere.services.impl;

import com.stayhere.entity.Categories;
import com.stayhere.repositories.CategoriesRepo;
import com.stayhere.services.interfaces.CategoriesService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CategoriesServiceImpl implements CategoriesService {

  private final CategoriesRepo categoriesRepo;

  public CategoriesServiceImpl(CategoriesRepo categoriesRepo) {
    this.categoriesRepo = categoriesRepo;
  }


  @Override
  public List<Categories> getAllCategories() {
    return categoriesRepo.findAll();
  }
}
