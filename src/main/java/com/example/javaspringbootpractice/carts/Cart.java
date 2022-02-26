package com.example.javaspringbootpractice.carts;

import com.example.javaspringbootpractice.products.Product;

import javax.persistence.*;
import java.util.Optional;

@Entity
public class Cart {

    @Id
    @GeneratedValue
    private int id;
    private int userId;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "productId", nullable = false)
    private Product product;

    private int amount;

    public Cart() {}

    public Cart(CartBody cartBody) {
        this.userId = cartBody.getUserId();
        this.amount = cartBody.getAmount();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
