package com.changellenge.hackaton.sber.changellengesber.model.entity;

import jakarta.persistence.*;
import lombok.*;



import java.math.BigDecimal;
import java.sql.Timestamp;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "loan_information")
public class LoanInformation  extends BaseEntity {


    private Long id;


    @ManyToOne
    @JoinColumn(name = "type")
    private TypeOfLoan type;

    @Column(name = "role")
    private Long role;

    @ManyToOne
    @JoinColumn(name = "status")
    private StatusOfObligation status;

    @Column(name = "date_from")
    private Timestamp dateFrom;

    @Column(name = "date_to")
    private Timestamp dateTo;

    @Column(name = "final_date")
    private Timestamp finalDate;

    @Column(name = "sum")
    private BigDecimal sum;

    @Column(name = "interest_rate")
    private BigDecimal interestRate;

    @Column(name = "balance_due")
    private BigDecimal balanceDue;

    @ManyToOne
    @JoinColumn(name = "delay")
    private Delay delay;

    @Column(name = "overdue_amount")
    private BigDecimal overdueAmount;
//
//    @OneToOne(orphanRemoval = true)
//    @JoinColumn(name = "client_id")
//    private Client client;


//    @ManyToOne
//    @JoinColumn(name = "request_uid")
//    private Request request;

    @ManyToOne
    @JoinColumn(name = "bki_id")
    private Bki bki;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

}
