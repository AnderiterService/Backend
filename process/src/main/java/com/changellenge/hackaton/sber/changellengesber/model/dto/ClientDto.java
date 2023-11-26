package com.changellenge.hackaton.sber.changellengesber.model.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientDto {
    private Long id;
    private String name;
    private String surname;
    private String fatherName;
    private Date dateBirth;
    private String passport;
    private String locationReg;
    private String locationLife;
    private Boolean children;
    private String workplace;
    private Date workExperience;
    private String workPosition;
    private Long monthlyIncome;
    private Long additionalIncome;
    private String additionalIncomeSourceName;
    private Boolean hasBankAccount;
    private String familyStatus;
}
