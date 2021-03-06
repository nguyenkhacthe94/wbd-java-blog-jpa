package com.blog.service;

import com.blog.model.Category;

public interface CategoryService {
    Iterable<Category> findAll();

    Category findById(Long id);

    void save(Category category);

    void delete (Long id);
}
