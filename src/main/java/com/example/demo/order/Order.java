package com.example.demo.order;

import com.example.demo.product.Product;

import java.util.List;

public class Order {
    private Long id;
    private List<Product> products;
    private OrderStatus orderStatus;
}
