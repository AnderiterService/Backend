package com.changellenge.hackaton.sber.changellengesber.model.dto;

import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class BkiDto {
    ContractDto contractDto;
    String ogrn;
}
