package com.example.demo_app.service;

import com.example.demo_app.entity.Product;
import com.example.demo_app.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {

    //private final List<String> dataList = Arrays.asList("1","2","3");

    @Autowired ProductRepository productRepository;

    public List<Product> fetchAllDataFromDB(){
        return productRepository.findAll();
    }

    @Transactional
    public void saveAllData(List<Product> products){
        productRepository.saveAll(products);
    }
}
