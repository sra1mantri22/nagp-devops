package com.example.demo_app.controller;

import com.example.demo_app.entity.Product;
import com.example.demo_app.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/data")
public class DataController {

    @Autowired
    DataService dataService;

    @GetMapping("/")
    public List<Product> fetchAllData(){
        return dataService.fetchAllDataFromDB();
    }

    @PostMapping("/save")
    public void saveProductData(@RequestBody  List<Product> products){
        dataService.saveAllData(products);
    }
}
