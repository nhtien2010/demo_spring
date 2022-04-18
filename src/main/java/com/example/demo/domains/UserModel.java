package com.example.demo.domains;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class UserModel extends BaseEntity{


    private String username;
    private String password;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String avatarUrl;
    private String roleId;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "userModel")
    private Cart cart;

    @OneToMany(mappedBy = "userModel")
    private List<Order> orders;

}
