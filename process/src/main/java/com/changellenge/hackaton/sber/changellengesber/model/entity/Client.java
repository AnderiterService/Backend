package com.changellenge.hackaton.sber.changellengesber.model.entity;

import org.hibernate.annotations.Type;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

import lombok.NoArgsConstructor;
//import org.hibernate.mapping.TypeDef;

import java.time.Period;
import java.util.Date;


@Entity
@Table(name = "clients")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//@TypeDef(name = "interval",
//        typeClass = PostgreSQLIntervalType.class,
//        defaultForType = Period.class
//)
public class Client extends BaseEntity {

    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "surname")
    private String surname;

    @NotNull
    @Column(name = "father_name")
    private String fatherName;

    @NotNull
    @Column(name = "date_birth")
    private Date dateBirth;

    @NotNull
    @Column(name = "passport")
    private String passport;

    @NotNull
    @Column(name = "location_reg")
    private String locationReg;

    @NotNull
    @Column(name = "location_life")
    private String locationLife;


    @NotNull
    @Column(name = "children")
    private Boolean children;

    @Column(name = "workplace")
    private String workplace;

    @Column(
            name = "work_experience")
//    @Type(type = "interval")
    private Date workExperience;


    @Column(name = "work_position")
    private String workPosition;

    @NotNull
    @Column(name = "monthly_income")
    private Long monthlyIncome;

    @Column(name = "additional_income")
    private Long additionalIncome;

    @Column(name = "additional_income_source_name")
    private String additionalIncomeSourceName;

    @NotNull
    @Column(name = "has_bank_account")
    private Boolean hasBankAccount;

    @ManyToOne
    @JoinColumn(name = "family_status_id")
    FamilyStatus familyStatus;

}
