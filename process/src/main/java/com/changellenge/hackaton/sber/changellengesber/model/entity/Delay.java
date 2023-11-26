package com.changellenge.hackaton.sber.changellengesber.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.*;


@Table(name = "delays")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@ToString
@Setter
public class Delay  extends BaseEntity{


    @Column(name = "id")
    private Long id;

    @Column(name = "type", length = 128)
    private String type;

}
