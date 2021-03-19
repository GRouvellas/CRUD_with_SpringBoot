/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouv.controller;

import grouv.entity.Size;
import grouv.service.SizeService;
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
public class SizeController {
    
    @Autowired
    private SizeService sizeService;
    
    @RequestMapping("/sizes") //Default is a GET Request 
    public List<Size> getAllSizes() {
        return sizeService.getAllSizes();
        
    }
    
    @RequestMapping("sizes/{id}")
    public Size getSize(@PathVariable int id) {
        return sizeService.getSize(id);
    }
    
    @RequestMapping(method = RequestMethod.POST, value="/sizes")
    public void addSize(@RequestBody Size size) {
        sizeService.addSize(size);
    }
    
    @RequestMapping(method = RequestMethod.PUT, value="/sizes/{id}")
    public void updateSize(@RequestBody Size size, @PathVariable int id) {
        sizeService.updateSize(id, size);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value="/sizes/{id}")
    public void deleteSize(@PathVariable int id) {
        sizeService.deleteSize(id);
    }
    
    
}
