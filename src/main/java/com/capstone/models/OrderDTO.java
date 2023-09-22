package com.capstone.models;

import java.util.HashMap;

public class OrderDTO {

    private Long customerId;

    private HashMap<String, Long> products;

    public OrderDTO() {}

    public OrderDTO(Long customerId, HashMap<String, Long> products) {
        this.customerId = customerId;
        this.products = products;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public HashMap<String, Long> getProducts() {
        return products;
    }

    public void setProducts(HashMap<String, Long> products) {
        this.products = products;
    }
}
