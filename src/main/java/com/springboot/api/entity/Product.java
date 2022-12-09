package com.springboot.api.entity;


import com.springboot.api.dto.ProductDto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long number;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Integer stock;

    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    public Product(long number, String name, Integer price, Integer stock, LocalDateTime createAt, LocalDateTime updateAt) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public Product() {

    }
}
