package com.example.demo.controllers;

import com.example.demo.dtos.requests.OrderRequestDTO;
import com.example.demo.dtos.requests.ShoppingProductRequestDTO;
import com.example.demo.dtos.requests.UpdateCartRequestDTO;
import com.example.demo.services.ProductService;
import com.example.demo.services.ShoppingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/api/shopping")
@RequiredArgsConstructor
public class ShoppingController {
    private final ShoppingService shoppingService;

    @RequestMapping(value = "/updateCart", method = RequestMethod.PUT)
    public ResponseEntity<?> updateCart(@Valid @RequestBody UpdateCartRequestDTO dto){
        return ResponseEntity.ok(shoppingService.updateCart(dto));
    }

    @RequestMapping(value = "/getCart", method = RequestMethod.GET)
    public ResponseEntity<?> getCart(@Valid @RequestParam("userId") Long userId){
        return ResponseEntity.ok(shoppingService.getCart(userId));
    }


    @RequestMapping(value = "/getOrder", method = RequestMethod.GET)
    public ResponseEntity<?> getOrder(@Valid @RequestParam("orderId") Long orderId) {
        return ResponseEntity.ok(shoppingService.getOrder(orderId));
    }
    @RequestMapping(value = "/listOrders", method = RequestMethod.GET)
    public ResponseEntity<?> getOrders(@Valid @RequestParam("userId") Long userId){
        return ResponseEntity.ok(shoppingService.getOrders(userId));
    }

    @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
    public ResponseEntity<?> addProduct(@Valid @RequestBody ShoppingProductRequestDTO dto){
        return ResponseEntity.ok(shoppingService.addProductToCart(dto));
    }

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public ResponseEntity<?> addProduct(@Valid @RequestBody OrderRequestDTO dto){
        return ResponseEntity.ok(shoppingService.orderProducts(dto));
    }

}
