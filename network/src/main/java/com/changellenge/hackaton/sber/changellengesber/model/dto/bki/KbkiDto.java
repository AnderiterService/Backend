package com.changellenge.hackaton.sber.changellengesber.model.dto.bki;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KbkiDto {
    CommitmentDto commitment;
    Long ogrn;
    String asOf;
}
