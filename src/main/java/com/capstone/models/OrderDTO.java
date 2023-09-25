package com.capstone.models;

import java.util.HashMap;

public class OrderDTO {

    private Long customerId;

    private HashMap<Long, Integer> products;

    public OrderDTO() {}

    public OrderDTO(Long customerId, HashMap<Long, Integer> products) {
        this.customerId = customerId;
        this.products = products;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public HashMap<Long, Integer> getProducts() {
        return products;
    }

    public void setProducts(HashMap<Long, Integer> products) {
        this.products = products;
    }
}
