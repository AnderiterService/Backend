package com.changellenge.hackaton.sber.changellengesber.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "status_of_obligation")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@ToString

public class StatusOfObligation  extends BaseEntity {


    @Column(name = "id")
    private Long id;

    @Column(name = "status", length = 128)
    private String status;

}
