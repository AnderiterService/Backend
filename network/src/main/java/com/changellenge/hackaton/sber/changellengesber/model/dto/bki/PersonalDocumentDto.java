package com.changellenge.hackaton.sber.changellengesber.model.dto.bki;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonalDocumentDto {
    String seria;
    String number;
    Date dateOfIssue;
    Short citizenship;
    Short codeDul;
}
