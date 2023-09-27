package com.capstone.controllers;

import com.capstone.models.Customer;
import com.capstone.models.CustomerDTO;
import com.capstone.repositories.CustomerRepository;
import com.capstone.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerRepository customerRepository;

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
        Customer createdCustomer = customerService.saveCustomer(customer);
        return new ResponseEntity<>(createdCustomer, HttpStatus.CREATED);
    }

    @PostMapping("/verification")
    public ResponseEntity<Customer> verifyCustomer(@RequestBody CustomerDTO customerDTO) {

        Customer verifedCustomer = customerService.verify(customerDTO);

        if (verifedCustomer != null) {
            return ResponseEntity.ok(verifedCustomer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
