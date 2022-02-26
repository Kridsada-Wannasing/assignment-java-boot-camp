package com.example.javaspringbootpractice.products;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String name) {
        super(name);
    }
}
