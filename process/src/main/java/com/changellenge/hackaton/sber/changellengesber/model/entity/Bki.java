package com.changellenge.hackaton.sber.changellengesber.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bki")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Setter
public class Bki extends BaseEntity{


    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "client_id")
    private Client client;

    @Column(name = "score")
    private Short score;



}