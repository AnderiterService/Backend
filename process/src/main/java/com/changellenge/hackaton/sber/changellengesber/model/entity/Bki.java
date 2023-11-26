package com.changellenge.hackaton.sber.changellengesber.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;

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

    @ToString.Exclude
    @OneToMany(mappedBy = "bki", orphanRemoval = true)
    private Set<LoanInformation> loanInformations = new LinkedHashSet<>();

}