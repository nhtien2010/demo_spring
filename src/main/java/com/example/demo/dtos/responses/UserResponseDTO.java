package com.example.demo.dtos.responses;


import com.example.demo.domains.Cart;
import com.example.demo.domains.Order;
import com.example.demo.domains.UserRole;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class UserResponseDTO {
    private Long id;
    private Date createdDate;
    private Date updatedDate;

    private String username;
    private String name;
    private String email;
    private String avatarUrl;

    private Set<UserRole> roles;
    private CartResponseDTO cart;
    private List<OrderResponseDTO> orders;
}
