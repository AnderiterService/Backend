package com.changellenge.hackaton.sber.dto.bki;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TitlePartDto {
    List<FioDto> fios;
    Date birthDate;
    PersonalDocumentDto personalDocument;
}
