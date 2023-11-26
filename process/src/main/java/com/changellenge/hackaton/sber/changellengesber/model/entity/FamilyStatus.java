package com.changellenge.hackaton.sber.changellengesber.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "family_status")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class FamilyStatus extends BaseEntity {
    @Column(name = "id")
    private Long id;

    @Column(name = "status")
    private String status;

}
