package com.FanFic.blog.services;

import com.FanFic.blog.domain.entities.Category;

import java.util.List;
import java.util.UUID;

public interface CategoryService {
    /**
     * Lists all categories with their post counts.
     */
    List<Category> listCategories();
    Category createCategory(Category category);
    void deleteCategory(UUID id);

    Category getCategoryById(UUID id);
}