package com.example.demo.services;

import com.example.demo.dtos.requests.AddCategoryRequestDTO;
import com.example.demo.dtos.requests.UpdateCategoryRequestDTO;
import com.example.demo.dtos.responses.CategoryResponseDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryResponseDTO> getAllCategories();
    CategoryResponseDTO addCategory(AddCategoryRequestDTO dto);
    Boolean deleteCategory(Long catId);
    CategoryResponseDTO updateCategory(UpdateCategoryRequestDTO dto);
}
