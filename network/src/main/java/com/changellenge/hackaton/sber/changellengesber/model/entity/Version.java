package com.changellenge.hackaton.sber.changellengesber.model.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Представляет сущность, которая хранит мета-информацию о версии базы данных.
 */
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Builder
@jakarta.persistence.Table(
        name = "version_metadata",
        uniqueConstraints = @UniqueConstraint(
                name = Version.VERSION_NAME_AND_PRODUCT_ID_UNIQUE,
                columnNames = {"product_id", "name"}
        )
)
public class Version extends BaseEntity {

    public static final String VERSION_NAME_AND_PRODUCT_ID_UNIQUE = "version_name_and_product_id_unique";

    @jakarta.persistence.Column(name = "name", nullable = false)
    private String name;

    @jakarta.persistence.Column(name = "datasource")
    private String datasource;

    @jakarta.persistence.Column(name = "login")
    private String login;

    @jakarta.persistence.Column(name = "password")
    private String password;

    @jakarta.persistence.Column(name = "schema")
    private String schema;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;
}