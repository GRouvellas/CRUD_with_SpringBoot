/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouv.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Geo
 */
@RestController
public class WelcomeController {
    
    @RequestMapping("/welcome")
    public String welcome() {
        return "Welcome!";
    }
}
