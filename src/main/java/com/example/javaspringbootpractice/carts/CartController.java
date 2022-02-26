package com.example.javaspringbootpractice.carts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carts")
public class CartController {

    @Autowired
    CartService cartService;

    @PostMapping("/addProduct")
    public ResponseEntity<Object> addProduct(@RequestBody CartBody cartBody) {
        Cart cart = cartService.addProductToCart(cartBody);
        return ResponseEntity.status(HttpStatus.OK).body(cart);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<Object> getProductInCartByUserId(@PathVariable int userId) {
        List<Cart> carts = cartService.getProductInCartByUserId(userId);
        return ResponseEntity.status(HttpStatus.OK).body(carts);
    }
}
