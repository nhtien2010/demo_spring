package com.example.demo.services.impls;

import com.example.demo.dtos.responses.CategoryResponseDTO;
import com.example.demo.dtos.responses.ProductResponseDTO;
import com.example.demo.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    @Override
    public ProductResponseDTO getProduct(Long pdId) {
        return null;
    }

    @Override
    public List<ProductResponseDTO> listProducts() {
        return null;
    }

    @Override
    public List<CategoryResponseDTO> listCategories() {
        return null;
    }
}
