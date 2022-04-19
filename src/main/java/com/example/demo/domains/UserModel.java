package com.example.demo.domains;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.*;

@Entity
@Getter
@Setter
public class UserModel extends BaseEntity implements UserDetails {


    private String username;
    private String password;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String avatarUrl;

    @Transient
    private Set<UserRole> roles = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "userModel")
    private Cart cart;

    @OneToMany(mappedBy = "userModel")
    private List<Order> orders;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
