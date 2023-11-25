package com.changellenge.hackaton.sber.changellengesber.model.dto.bki;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TitlePartDto {
    List<FioDto> fios;
    Date birthDate;
    PersonalDocumentDto personalDocument;
}
