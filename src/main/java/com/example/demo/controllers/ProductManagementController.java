package com.example.demo.controllers;

import com.example.demo.dtos.requests.AddProductRequestDTO;
import com.example.demo.dtos.requests.RegisterRequestDTO;
import com.example.demo.dtos.requests.UpdateProductRequestDTO;
import com.example.demo.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/api/product")
@RequiredArgsConstructor
public class ProductManagementController {
    private final ProductService productService;

    @RequestMapping(value = "/{prId}", method = RequestMethod.GET)
    public ResponseEntity<?> getProduct(@Valid @PathVariable Long prId){
        return ResponseEntity.ok(productService.getProduct(prId));
    }
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<?> listProducts(){
        return ResponseEntity.ok(productService.listProducts());
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<?> addProduct(@Valid @RequestBody AddProductRequestDTO request){
        return ResponseEntity.ok(productService.addProduct(request));
    }
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<?> updateProduct(@Valid @RequestBody UpdateProductRequestDTO request){
        return ResponseEntity.ok(productService.updateProduct(request));
    }
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteProduct(@Valid @RequestParam("prId") Long prId){
        return ResponseEntity.ok(productService.deleteProduct(prId));
    }

}
