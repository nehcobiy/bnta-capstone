package com.capstone.services;

import com.capstone.models.Customer;
import com.capstone.repositories.CustomerRepository;
import com.capstone.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrderRepository orderRepository;

    public List<Customer> findAllCustomers(){
        return customerRepository.findAll();
    }

    public Optional<Customer> findCustomerById(Long id){
        return customerRepository.findById(id);
    }

    public Customer saveCustomer(Customer customer){
       return customerRepository.save(customer);
    }
}
