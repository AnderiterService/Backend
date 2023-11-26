package com.changellenge.hackaton.sber.changellengesber.model.mapper;

import com.changellenge.hackaton.sber.changellengesber.model.dto.ClientDTO;
import com.changellenge.hackaton.sber.changellengesber.model.entity.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ClientMapper {
    @Mapping(target = "firstName", source = "name")
    @Mapping(target = "secondName", source = "surname")
    @Mapping(target = "lastName", source = "fatherName")
    @Mapping(target = "birthDate", source = "dateBirth")
    @Mapping(target = "passport", source = "passport")
    @Mapping(target = "formalResidence", source = "locationReg")
    @Mapping(target = "actualResidence", source = "locationLife")
    public ClientDTO mapClientToDTO(Client client);
}