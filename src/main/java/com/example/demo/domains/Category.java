package com.example.demo.domains;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
