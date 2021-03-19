/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouv.controller;

import grouv.entity.Category;
import grouv.service.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Geo
 */
@RestController
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;
    
    @RequestMapping("/categories") 
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
        
    }
    
    @RequestMapping("categories/{id}")
    public Category getCategory(@PathVariable int id) {
        return categoryService.getCategory(id);
    }
    
    @RequestMapping(method = RequestMethod.POST, value="/categories")
    public void addCategory(@RequestBody Category category) {
        categoryService.addCategory(category);
    }
    
    @RequestMapping(method = RequestMethod.PUT, value="/categories/{id}")
    public void updateCategory(@RequestBody Category category, @PathVariable int id) {
        categoryService.updateCategory(id, category);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value="/categories/{id}")
    public void deleteCategory(@PathVariable int id) {
        categoryService.deleteCategory(id);
    }
    
    
}
