package grouv.controller;

import grouv.entity.Product;
import grouv.service.ProductService;
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
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    @RequestMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
        
    }
    
    @RequestMapping("products/{id}")
    public Product getProduct(@PathVariable int id) {
        return productService.getProduct(id);
    }
    
    @RequestMapping(method = RequestMethod.POST, value="/products")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }
    
    @RequestMapping(method = RequestMethod.PUT, value="/products/{id}")
    public void updateProduct(@RequestBody Product product, @PathVariable int id) {
        productService.updateProduct(id, product);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value="/products/{id}")
    public void deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
    }
    
    @RequestMapping("/products/type/{prodType}")
    public List<Product> findByProdType(@PathVariable String prodType) {
        return productService.findByProdType(prodType);
        
    }
    
    
}
