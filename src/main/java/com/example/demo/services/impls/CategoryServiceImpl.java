package com.example.demo.services.impls;

import com.example.demo.dtos.requests.AddCategoryRequestDTO;
import com.example.demo.dtos.requests.UpdateCategoryRequestDTO;
import com.example.demo.dtos.responses.CategoryResponseDTO;
import com.example.demo.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    @Override
    public List<CategoryResponseDTO> getAllCategories() {
        return null;
    }

    @Override
    public CategoryResponseDTO addCategory(AddCategoryRequestDTO dto) {
        return null;
    }

    @Override
    public Boolean deleteCategory(Long catId) {
        return null;
    }

    @Override
    public CategoryResponseDTO updateCategory(UpdateCategoryRequestDTO dto) {
        return null;
    }
}
