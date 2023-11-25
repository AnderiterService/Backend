package com.changellenge.hackaton.sber.changellengesber.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "client_requests")
@Data
public class ClientRequest {

    @EmbeddedId
    private ClientKey id;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;


}
