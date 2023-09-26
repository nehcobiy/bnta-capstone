package com.capstone.controllers;

import com.capstone.models.Product;
import com.capstone.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts(@RequestParam(required = false, name="category") String category) {

        List<Product> products = productService.findProducts(category);

        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Optional<Product>> getProductById(@PathVariable Long id){
        Optional<Product> foundProduct = productService.findProductById(id);

        if (foundProduct.isPresent()){
            return new ResponseEntity<>(foundProduct, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        Product createdProduct = productService.saveProduct(product);
        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
    }

    @GetMapping(value = "/random/{count}")
    public ResponseEntity<List<Product>> getRandomProducts(@PathVariable int count) {
        List<Product> allProducts = productService.findAllProducts(); // Assuming you have a method to get all products

        if (count >= allProducts.size()) {
            return new ResponseEntity<>(allProducts, HttpStatus.OK);
        } else {
            Random random = new Random();
            List<Product> randomProducts = random
                    .ints(count, 0, allProducts.size())
                    .mapToObj(allProducts::get)
                    .collect(Collectors.toList());

            return new ResponseEntity<>(randomProducts, HttpStatus.OK);
        }
    }


}
