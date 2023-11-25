package com.changellenge.hackaton.sber.changellengesber.model.entity;


import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "clients")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Client  extends BaseEntity{

    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "surname")
    private String surname;

    @Column(name = "father_name")
    private String fatherName;

    @NotNull
    @Column(name = "date_birth")
    private String dateBirth;

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
    @Column(name = "family_status")
    private Byte familyStatus;

    @NotNull
    @Column(name = "children")
    private Boolean children;

    @Column(name = "workplace")
    private String workplace;

    @NotNull
    @Column(name = "work_experience")
    private Byte workExperience;

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


//    @OneToMany(mappedBy = "client", orphanRemoval = true)
//    private Set<Docs> docs = new LinkedHashSet<>();

}
