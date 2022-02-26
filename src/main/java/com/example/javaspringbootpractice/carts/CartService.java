package com.example.javaspringbootpractice.carts;

import com.example.javaspringbootpractice.products.Product;
import com.example.javaspringbootpractice.products.ProductNotFoundException;
import com.example.javaspringbootpractice.products.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {

    @Autowired
    CartRepository cartRepository;

    @Autowired
    ProductService productService;

    public List<Cart> getProductInCartByUserId(int userId) {
        return cartRepository.findByUserId(userId);
    }

    public Cart addProductToCart(CartBody cartBody) {
        Optional<Product> product = productService.getProductById(cartBody.getProductId());

        if(!product.isEmpty()) {
            throw new ProductNotFoundException("Product not found");
        }

        Cart cart = new Cart(cartBody);
        cart.setProduct(product.get());
        return cartRepository.save(cart);
    }
}
