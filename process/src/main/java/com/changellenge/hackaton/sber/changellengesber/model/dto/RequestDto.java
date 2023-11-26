package com.changellenge.hackaton.sber.changellengesber.model.dto;

import com.changellenge.hackaton.sber.changellengesber.model.entity.Status;
import lombok.*;

import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RequestDto {

    private Long id;

    private Long uid;

    private Long startTimestamp;

    private String sla;

    private String status;

    private Short pdn;

    private String creditHistoryAnalysis;

    private String applicationAnalysis;

    private String finalDecision;

}
