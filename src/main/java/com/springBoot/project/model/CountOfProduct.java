package com.springBoot.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "product_count")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountOfProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private com.springBoot.project.model.Product product;
    private int count;
}
