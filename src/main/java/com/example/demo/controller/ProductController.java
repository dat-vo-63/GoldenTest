package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductIService;

@RestController
@CrossOrigin (value = "*")
public class ProductController {
    @Autowired
    public ProductIService iService;

    @PostMapping ("/add/product")
    public String addProduct (@RequestBody Product product) {
        return iService.addProduct(product);
    }
    @GetMapping ("/AllProduct")
    public List<Product> findAllProduct(){
        return iService.findAll();
    }
}