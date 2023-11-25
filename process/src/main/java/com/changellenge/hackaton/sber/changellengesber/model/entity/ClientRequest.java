package com.changellenge.hackaton.sber.changellengesber.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "client_requests")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ClientRequest {

    @EmbeddedId
    private ClientKey id;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;


}
