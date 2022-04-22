package com.example.demo.services.impls;

import com.example.demo.dtos.requests.OrderRequestDTO;
import com.example.demo.dtos.requests.ShoppingProductRequestDTO;
import com.example.demo.dtos.requests.UpdateCartRequestDTO;
import com.example.demo.dtos.responses.CartResponseDTO;
import com.example.demo.dtos.responses.OrderResponseDTO;
import com.example.demo.services.ShoppingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShoppingServiceImpl implements ShoppingService {
    @Override
    public CartResponseDTO updateCart(UpdateCartRequestDTO dto) {
        return null;
    }

    @Override
    public CartResponseDTO getCart(Long userId) {
        return null;
    }

    @Override
    public OrderResponseDTO getOrder(Long orderId) {
        return null;
    }

    @Override
    public List<OrderResponseDTO> getOrders(Long userId) {
        return null;
    }

    @Override
    public CartResponseDTO addProductToCart(ShoppingProductRequestDTO dto) {
        return null;
    }

    @Override
    public OrderResponseDTO orderProducts(OrderRequestDTO dto) {
        return null;
    }
}
