package com.capstone.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int price;

    @Column(length = 1024) //length is number of characters
    private String description;

    @Column
    private int stock;

    @Column
    private String image;

    @Enumerated(EnumType.STRING)
    private Category category;

    @JsonBackReference
    @OneToMany(mappedBy = "product")
    @JsonIgnoreProperties({"product"})
    private List<OrderProduct> orderProducts;

    public Product() {}

    public Product(String name, int price, String description, int stock, String image, Category category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
        this.image = image;
        this.category = category;
        this.orderProducts = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<OrderProduct> getOrderProducts() {
        return orderProducts;
    }

    public void setOrderProducts(List<OrderProduct> orderProducts) {
        this.orderProducts = orderProducts;
    }
}
