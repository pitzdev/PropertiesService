package com.stayhere.services.interfaces;

import com.stayhere.entity.Category;
import java.util.List;
import java.util.Optional;

public interface CategoryService {

  List<Category> getAllCategories();

  Category save(Category category);

  Optional<Category> findById(Long id);
}
