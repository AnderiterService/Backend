package com.changellenge.hackaton.sber.changellengesber.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

/**
 * Представляет сущность, которая хранит мета-информацию о продукте.
 */
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Builder
@Table(name = "product_metadata")
public class Product extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    @CollectionTable(name = "versions")
    private List<Version> versions;
}