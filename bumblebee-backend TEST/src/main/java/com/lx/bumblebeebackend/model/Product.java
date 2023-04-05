package com.lx.bumblebeebackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="productgenerator")
    @SequenceGenerator(name="productgenerator", sequenceName="productequence")
    private int id;
    private String name;
    private String brand;
    private String category;
    private int quantity;
    private double price;
}
