package com.capstone.repositories;

import com.capstone.models.Category;
import com.capstone.models.Order;
import com.capstone.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>  {

    List<Product> findByCategory(Category category);
}
