package com.example.demo.services;

import com.example.demo.dtos.requests.*;
import com.example.demo.dtos.responses.CartResponseDTO;
import com.example.demo.dtos.responses.CategoryResponseDTO;
import com.example.demo.dtos.responses.ProductResponseDTO;
import com.example.demo.dtos.responses.UserResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    ProductResponseDTO getProduct(Long pdId);
    List<ProductResponseDTO> listProducts();
    ProductResponseDTO addProduct(AddProductRequestDTO dto);
    Boolean deleteProduct(Long prdId);
    ProductResponseDTO updateProduct(UpdateProductRequestDTO dto);
}
