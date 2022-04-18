package com.example.demo.repositories;

import com.example.demo.domains.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Long> {
}
