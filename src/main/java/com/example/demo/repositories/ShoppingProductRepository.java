package com.example.demo.repositories;

import com.example.demo.domains.ShoppingProduct;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingProductRepository extends CrudRepository<ShoppingProduct, Long> {
}
