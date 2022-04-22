package com.example.demo.controllers;

import com.example.demo.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/api/product")
@RequiredArgsConstructor
public class ProductManagementController {
    private final ProductService productService;

    @RequestMapping(value = "/getProduct", method = RequestMethod.GET)
    public ResponseEntity<?> getUser(@Valid @RequestParam("prdId") Long prdId){
        return ResponseEntity.ok(productService.getProduct(prdId));
    }
    @RequestMapping(value = "/listProducts", method = RequestMethod.GET)
    public ResponseEntity<?> listProducts(){
        return ResponseEntity.ok(productService.listProducts());
    }
    @RequestMapping(value = "/listCategories", method = RequestMethod.GET)
    public ResponseEntity<?> listCategories(){
        return ResponseEntity.ok(productService.listCategories());
    }
}
