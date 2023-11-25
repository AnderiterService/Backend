package com.changellenge.hackaton.sber.changellengesber.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "request_status")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class RequestStatus  extends BaseEntity{


    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @Column(name = "score")
    private Short score;

}
