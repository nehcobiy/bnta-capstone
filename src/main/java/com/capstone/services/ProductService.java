package com.capstone.services;

import com.capstone.models.Category;
import com.capstone.models.Product;
import com.capstone.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> findProductById(Long id){
        return productRepository.findById(id);
    }

    public List<Product> findProducts(String category){

        Category foundCategory = Category.findByName(category);

        List<Product> foundProducts = productRepository.findAll();

        if (category != null) {
            foundProducts = productRepository.findByCategory(foundCategory);
        }

        return foundProducts;

    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

}
