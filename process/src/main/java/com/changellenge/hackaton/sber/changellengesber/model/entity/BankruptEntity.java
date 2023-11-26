package com.changellenge.hackaton.sber.changellengesber.model.entity;

import com.changellenge.hackaton.sber.changellengesber.model.dto.ClientDTO;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "bankrupt_mapping")
public class BankruptEntity extends BaseEntity
{
    @Embedded
    @AttributeOverride( name = "firstName", column = @Column(name = "first_name"))
    @AttributeOverride( name = "secondName", column = @Column(name = "second_name"))
    @AttributeOverride( name = "lastName", column = @Column(name = "last_name"))
    private ClientDTO client;
    @Column(name = "isChecked")
    @Getter
    private boolean isChecked;
}