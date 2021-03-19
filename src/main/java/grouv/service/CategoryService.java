/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouv.service;

import grouv.entity.Category;
import grouv.repository.CategoryRepo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Geo
 */
@Service 
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    public List<Category> getAllCategories() {
        List<Category> categories = new ArrayList();
        for (Category c : categoryRepo.findAll()) {
            categories.add(c);
        }
        return categories;
    }

    public Category getCategory(int id) {
        return categoryRepo.findById(id).get();
    }

    public void addCategory(Category category) {
        categoryRepo.save(category);
    }

    public void updateCategory(int id, Category category) {
        categoryRepo.save(category);
    }

    public void deleteCategory(int id) {
        categoryRepo.deleteById(id);
    }

    
}