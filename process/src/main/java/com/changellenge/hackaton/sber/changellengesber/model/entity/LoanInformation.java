package com.changellenge.hackaton.sber.changellengesber.model.entity;

import jakarta.persistence.*;
import lombok.*;




import java.sql.Timestamp;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@ToString
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
    private Double sum;

    @Column(name = "interest_rate")
    private Double interestRate;

    @Column(name = "balance_due")
    private Double balanceDue;

    @ManyToOne
    @JoinColumn(name = "delay")
    private Delay delay;

    @Column(name = "overdue_amount")
    private Double overdueAmount;

    @Column(name = "monthly_pay")
    private Double monthlyPay;
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
