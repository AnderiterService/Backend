package com.changellenge.hackaton.sber.dto.bki;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommitmentDto {
    List<BkiDto> bki;
}
