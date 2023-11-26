package com.changellenge.hackaton.sber.changellengesber.model.dto;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ClientDTO
{
    @Getter @Setter
    private String firstName;
    @Getter @Setter
    private String secondName;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private LocalDate birthDate;
    @Getter @Setter
    private String passport;
    @Getter @Setter
    private String formalResidence;
    @Getter @Setter
    private String actualResidence;
}