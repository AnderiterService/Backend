package com.changellenge.hackaton.sber.changellengesber.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ClientKey  implements Serializable {
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "request_uid")
    private Request request;

}

