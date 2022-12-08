package com.springboot.api.repository;


import com.springboot.api.entity.Product;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface ProductRepository extends JpaRepository<Product, Long> {
}
