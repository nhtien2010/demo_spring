package com.example.demo.services.impls;

import com.example.demo.dtos.requests.AddCategoryRequestDTO;
import com.example.demo.dtos.requests.AddProductRequestDTO;
import com.example.demo.dtos.requests.UpdateCategoryRequestDTO;
import com.example.demo.dtos.requests.UpdateProductRequestDTO;
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
    public ProductResponseDTO addProduct(AddProductRequestDTO dto) {
        return null;
    }

    @Override
    public Boolean deleteProduct(Long prdId) {
        return null;
    }

    @Override
    public ProductResponseDTO updateProduct(UpdateProductRequestDTO dto) {
        return null;
    }

}
