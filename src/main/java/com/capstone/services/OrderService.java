package com.capstone.services;

import com.capstone.models.*;
import com.capstone.repositories.CustomerRepository;
import com.capstone.repositories.OrderProductRepository;
import com.capstone.repositories.OrderRepository;
import com.capstone.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    OrderProductRepository orderProductRepository;

//    CREATE - ORDER
    public Order saveOrder(OrderDTO orderDTO){
        Order newOrder = new Order(customerRepository.findById(orderDTO.getCustomerId()).get());
        orderRepository.save(newOrder);
        HashMap<Long, Integer> newProducts = orderDTO.getProducts();
        newProducts.forEach((productId, quantity) -> {
            Product foundProduct = productRepository.findById(productId).get();
            OrderProduct newOrderProduct = new OrderProduct(newOrder, foundProduct, quantity);
            orderProductRepository.save(newOrderProduct);
            newOrder.addOrderProduct(newOrderProduct);

        });
        return newOrder;
    }

    public List<Order> findAllOrders(){
        return orderRepository.findAll();
    }

    public Optional<Order> findOrderById(Long id){
        return orderRepository.findById(id);
    }

}
