package com.example.javaspringbootpractice.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public ResponseEntity<Object> searchProducts(@RequestParam String name) {
        List<Product> products = productService.searchProducts(name);
        return ResponseEntity.status(HttpStatus.OK).body(products);
    }
}
