package com.changellenge.hackaton.sber.changellengesber.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "type_of_loan")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class TypeOfLoan  extends BaseEntity{

    @Column(name = "id")
    private Long id;

    @Column(name = "type", length = 128)
    private String type;

}
