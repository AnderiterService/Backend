package com.changellenge.hackaton.sber.changellengesber.model.dto;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoanInformationDto {
    private Long id;
    private TypeOfLoanDto type;
    private Long role;
    private String status;
    private Timestamp dateFrom;
    private Timestamp dateTo;
    private Timestamp finalDate;
    private Double sum;
    private Double interestRate;
    private Double balanceDue;
    private String delay;
    private Double overdueAmount;
    private Double monthlyPay;
}
