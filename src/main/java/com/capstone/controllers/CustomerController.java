package com.capstone.controllers;

import com.capstone.models.Customer;
import com.capstone.models.Product;
import com.capstone.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

     //GET - INDEX
    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers(){
        return new ResponseEntity<>(customerService.findAllCustomers(), HttpStatus.OK);
    }

    // GET - SHOW
    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable Long id) {
        Optional<Customer> foundCustomer = customerService.findCustomerById(id);

        if (foundCustomer.isPresent()) {
            return new ResponseEntity<>(foundCustomer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

    }

    // POST - CREATE
    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
        return new ResponseEntity<>(customerService.saveCustomer(customer), HttpStatus.CREATED);
    }

}
