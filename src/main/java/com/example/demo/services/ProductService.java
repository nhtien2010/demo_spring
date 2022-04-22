package com.example.demo.services;

import com.example.demo.dtos.requests.UpdateCartRequestDTO;
import com.example.demo.dtos.responses.CartResponseDTO;
import com.example.demo.dtos.responses.CategoryResponseDTO;
import com.example.demo.dtos.responses.ProductResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    ProductResponseDTO getProduct(Long pdId);
    List<ProductResponseDTO> listProducts();
    List<CategoryResponseDTO> listCategories();


}
