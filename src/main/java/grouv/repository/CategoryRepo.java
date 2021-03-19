/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouv.repository;

import grouv.entity.Category;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Geo
 */
public interface CategoryRepo extends CrudRepository<Category, Integer> {
    
}
