package com.stayhere.controllers;

import com.stayhere.entity.Categories;
import com.stayhere.services.interfaces.CategoriesService;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CategoriesController {

  private final CategoriesService categoriesService;

  public CategoriesController(CategoriesService categoriesService) {
    this.categoriesService = categoriesService;
  }

  @RequestMapping(method = RequestMethod.GET, value = "/categories")
  public List<Categories> getCategories() {
    return categoriesService.getAllCategories();
  }


}
