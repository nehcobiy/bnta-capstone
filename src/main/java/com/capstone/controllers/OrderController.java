package com.capstone.controllers;

import com.capstone.models.Order;
import com.capstone.models.OrderDTO;
import com.capstone.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("orders")
public class OrderController {

@Autowired
    OrderService orderService;

// CREATE - ORDER
    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody OrderDTO orderDTO){
        Order createdOrder = orderService.saveOrder(orderDTO);
        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Order>> getOrders(@RequestParam(required = false, name = "customerId") Long customerId){
        List<Order> orders = orderService.findOrders(customerId);
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Order>> getOrderById(@PathVariable Long id){
        Optional<Order> foundOrder = orderService.findOrderById(id);

        if (foundOrder.isPresent()){
            return new ResponseEntity<>(foundOrder, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

    }




}
