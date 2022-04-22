package com.example.demo.services;

import com.example.demo.dtos.requests.OrderRequestDTO;
import com.example.demo.dtos.requests.ShoppingProductRequestDTO;
import com.example.demo.dtos.requests.UpdateCartRequestDTO;
import com.example.demo.dtos.responses.CartResponseDTO;
import com.example.demo.dtos.responses.OrderResponseDTO;
import com.example.demo.dtos.responses.ShoppingProductResponseDTO;

import java.util.List;

public interface ShoppingService {
    CartResponseDTO updateCart(UpdateCartRequestDTO dto);
    CartResponseDTO getCart(Long userId);
    OrderResponseDTO getOrder(Long orderId);
    List<OrderResponseDTO> getOrders(Long userId);
    CartResponseDTO addProductToCart(ShoppingProductRequestDTO dto);
    OrderResponseDTO orderProducts(OrderRequestDTO dto);

}
