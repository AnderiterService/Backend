package com.changellenge.hackaton.sber.changellengesber.model.dto.bki;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MounthPaymentDto {
    Date paymentDate;
    String currency;
    String text;
}
