package com.example.demo.repositories;

import com.example.demo.domains.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
