/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouv.repository;

import grouv.entity.Product;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Geo
 */
public interface ProductRepo extends CrudRepository<Product, Integer>{
    
    public List<Product> findByProdType(String prodType);
    
}
