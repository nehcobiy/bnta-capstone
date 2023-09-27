package com.capstone.repositories;

import com.capstone.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

   Customer findByEmail(String email);

   Customer findByEmailAndPassword(String email, String password);
}
