package com.example.demo.dtos.requests;

import java.util.List;

public class OrderRequestDTO {
    private String address;
    private String phoneNumber;
    private List<ShoppingProductRequestDTO> shoppingProducts;
}
