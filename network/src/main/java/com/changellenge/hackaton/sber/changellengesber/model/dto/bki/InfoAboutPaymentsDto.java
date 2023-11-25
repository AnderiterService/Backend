package com.changellenge.hackaton.sber.changellengesber.model.dto.bki;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Шаблон Dto
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InfoAboutPaymentsDto {
    TitlePartDto titlePartDto;
    KbkiDto kdki;
    String version;
    String requestId;
    String responseId;
    String ogrn;
    int requestType;
}
