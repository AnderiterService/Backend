package com.changellenge.hackaton.sber.changellengesber.model.entity;
import jakarta.persistence.*;
import lombok.*;
@Table(name = "request_status")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@ToString
@Builder
public class Status  extends BaseEntity{


    @Column(name = "id")
    private Long id;

    @Column(name = "status", length = 128)
    private String status;

}