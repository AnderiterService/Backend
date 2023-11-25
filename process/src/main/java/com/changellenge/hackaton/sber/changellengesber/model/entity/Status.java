package com.changellenge.hackaton.sber.changellengesber.model.entity;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "request_status")
@Data
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "status", length = 128)
    private String status;

}