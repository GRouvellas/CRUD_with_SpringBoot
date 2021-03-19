/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouv.service;

import grouv.entity.Product;
import grouv.repository.ProductRepo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Geo
 */
@Service
public class ProductService {
    
    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList();
        for (Product p : productRepo.findAll()) {
            products.add(p);
        }
        return products;
    }

    public Product getProduct(int id) {
        return productRepo.findById(id).get();
    }

    public void addProduct(Product product) {
        productRepo.save(product);
    }

    public void updateProduct(int id, Product product) {
        productRepo.save(product);
    }

    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }
    
    public List<Product> findByProdType(String prodType) {
        return productRepo.findByProdType(prodType);
    }

    
}

