package com.example.demo.repositories;

import com.example.demo.domains.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, Long> {
}
