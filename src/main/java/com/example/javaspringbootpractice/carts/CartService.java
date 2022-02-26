package com.example.javaspringbootpractice.carts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    CartRepository cartRepository;

    public Cart addProductToCart(CartBody cartBody) {
        Cart cart = new Cart(cartBody);
        return cartRepository.save(cart);
    }
}
