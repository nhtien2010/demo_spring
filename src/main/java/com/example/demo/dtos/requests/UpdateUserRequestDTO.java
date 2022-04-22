package com.example.demo.dtos.requests;

import com.example.demo.domains.Cart;
import com.example.demo.domains.Order;
import com.example.demo.domains.UserRole;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UpdateUserRequestDTO {
    private String username;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String avatarUrl;
}
