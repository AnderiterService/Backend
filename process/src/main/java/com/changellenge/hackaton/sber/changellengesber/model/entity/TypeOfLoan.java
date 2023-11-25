package com.changellenge.hackaton.sber.changellengesber.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "type_of_loan")
@Data
public class TypeOfLoan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "type", length = 128)
    private String type;

}
