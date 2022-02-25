package com.example.javaspringbootpractice.products;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Double> {

    List<Product> findByNameContainingIgnoreCase(String name);
}