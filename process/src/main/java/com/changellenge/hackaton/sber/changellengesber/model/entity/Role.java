package com.changellenge.hackaton.sber.changellengesber.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "roles")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class Role  extends BaseEntity{


    @Column(name = "id")
    private Long id;

    @Column(name = "role", length = 128)
    private String role;

}
