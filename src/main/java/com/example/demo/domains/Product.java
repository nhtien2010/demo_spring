package com.example.demo.domains;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private Float price;
    private String currency;
    @ElementCollection
    private List<String> imageUrls;

    @OneToMany
    private Set<Category> categories;
}
