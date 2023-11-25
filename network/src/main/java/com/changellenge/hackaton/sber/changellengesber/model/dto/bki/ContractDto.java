package com.changellenge.hackaton.sber.changellengesber.model.dto.bki;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContractDto {
    MounthPaymentDto mountPayment;
    String uid;
}
