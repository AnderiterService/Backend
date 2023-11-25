package com.changellenge.hackaton.sber.changellengesber.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "docs")
@Data
public class Docs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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