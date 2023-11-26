package com.changellenge.hackaton.sber.changellengesber.model.entity;

import jakarta.persistence.*;
import lombok.*;


@Table(name = "docs")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class Docs  extends BaseEntity{


    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @Column(name = "doc_name", length = 256)
    private String docName;

    @Column(name = "file", nullable = false)
    @Lob
    private byte file;


}