package com.FanFic.blog.services.impl;

import com.FanFic.blog.domain.entities.Category;
import com.FanFic.blog.repositories.CategoryRepository;
import com.FanFic.blog.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> listCategories() {
        return categoryRepository.findAllWithPostCount();
    }
    @Override
    @Transactional
    public Category createCategory(Category category) {
        // Check if category with same name already exists
        if (categoryRepository.existsByNameIgnoreCase(category.getName())) {
            throw new IllegalArgumentException("Category already exists with name: " + category.getName());
        }

        return categoryRepository.save(category);
    }
    @Override
    public void deleteCategory(UUID id) {
        Optional<Category> category = categoryRepository.findById(id);
        if(category.isPresent()) {
            if(!category.get().getPosts().isEmpty()) {
                throw new IllegalStateException("Category has posts associated with it");
            }
            categoryRepository.deleteById(id);
        }
    }
    @Override
    public Category getCategoryById(UUID id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Category not found with ID: " + id));
    }
}
