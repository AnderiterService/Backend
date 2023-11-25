package com.changellenge.hackaton.sber.changellengesber.model.entity;

import com.changellenge.hackaton.sber.changellengesber.model.entity.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "requests")
@Data
public class Request {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "uid")
        private Long uid;

        @Column(name = "start_timestamp")
        private Long startTimestamp;

        @Column(name = "sla_id")
        private java.sql.Timestamp slaId;

        @ManyToOne
        @JoinColumn(name = "status_id")
        private Status statusId;

        @Column(name = "pdn")
        private Short pdn;

        @Column(name = "credit_history_analysis")
        private String creditHistoryAnalysis;

        @Column(name = "application_analysis")
        private String applicationAnalysis;

        @Column(name = "final_decision")
        private String finalDecision;




}
