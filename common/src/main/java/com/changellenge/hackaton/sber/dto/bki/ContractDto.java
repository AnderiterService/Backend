package com.changellenge.hackaton.sber.dto.bki;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContractDto {
    MounthPaymentDto mountPayment;
    String uid;
}
