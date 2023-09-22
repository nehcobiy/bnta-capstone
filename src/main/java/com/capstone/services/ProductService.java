package com.capstone.services;

import com.capstone.models.Product;
import com.capstone.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }


}
