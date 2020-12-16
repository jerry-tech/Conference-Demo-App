/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pluralsight.demo.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@RestController
public class HomeController {
    @Value("${app.version}")
    private String appVersion;
    
    @GetMapping
    @RequestMapping("/")
    public Map getStatus() {
       
        Map map = new HashMap<String, String>();
        map.put("app-version", appVersion);
        return map;
    }
    
    
}
