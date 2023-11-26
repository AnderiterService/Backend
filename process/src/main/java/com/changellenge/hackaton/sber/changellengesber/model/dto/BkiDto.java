package com.changellenge.hackaton.sber.changellengesber.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BkiDto {
    private Long id;
    private Short score;
    private List<LoanInformationDto> loanInformations;
}