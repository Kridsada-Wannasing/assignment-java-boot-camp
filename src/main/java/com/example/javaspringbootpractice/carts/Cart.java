package com.example.javaspringbootpractice.carts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cart {

    @Id
    @GeneratedValue
    private int id;
    private int userId;


    public Cart() {}

    public Cart(CartBody cartBody) {
        this.userId = cartBody.getUserId();
        this.productId = cartBody.getProductId();
        this.amount = cartBody.getAmount();
    }

    private int productId;
    private int amount;

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

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
