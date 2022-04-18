package com.example.demo.repositories;

import com.example.demo.domains.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
