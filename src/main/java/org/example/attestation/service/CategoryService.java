package org.example.attestation.service;

import org.example.attestation.model.Category;
import org.example.attestation.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories() {
        // Метод, который возвращает только неудаленные категории
        return categoryRepository.findAllByDeletedFalse();
    }

    public Optional<Category> getCategoryById(Long id) {
        // Проверка, что категория не помечена как удаленная
        return categoryRepository.findById(id)
                .filter(category -> !category.getDeleted());
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category updateCategory(Long id, Category categoryDetails) {
        Category category = getCategoryById(id)
                .orElseThrow(() -> new RuntimeException("Category not found with id " + id));
        category.setName(categoryDetails.getName());
        category.setDescription(categoryDetails.getDescription());
        return categoryRepository.save(category);
    }

    public void deleteCategory(Long id) {
        Category category = getCategoryById(id)
                .orElseThrow(() -> new RuntimeException("Category not found with id " + id));
        category.setDeleted(true);
        categoryRepository.save(category);
    }
}
