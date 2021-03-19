/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouv.service;

import grouv.entity.Size;
import grouv.repository.SizeRepo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Geo
 */
@Service //creates a Singleton bean
public class SizeService {

    @Autowired
    private SizeRepo sizeRepo;

    public List<Size> getAllSizes() {
        List<Size> sizes = new ArrayList();
        for (Size s : sizeRepo.findAll()) {
            sizes.add(s);
        }
        return sizes;
    }

    public Size getSize(int id) {
        return sizeRepo.findById(id).get();
    }

    public void addSize(Size size) {
        sizeRepo.save(size);
    }

    public void updateSize(int id, Size size) {
        sizeRepo.save(size);
    }

    public void deleteSize(int id) {
        sizeRepo.deleteById(id);
    }

}
