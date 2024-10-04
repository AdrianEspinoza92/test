package com.service.accountsmovementsservice.aplication.mapper;


import com.service.accountsmovementsservice.domain.dto.TransactionDTO;
import com.service.accountsmovementsservice.domain.entities.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TransactionDtoMapper {
    @Mapping(source = "idTransaction", target = "idTransaction")
    @Mapping(source = "account", target = "account")
    @Mapping(source = "idAccount", target = "idAccount")
    @Mapping(source = "date", target = "date")
    @Mapping(source = "transactionType", target = "transactionType")
    @Mapping(source = "value", target = "value")
    @Mapping(source = "balance", target = "balance")
    TransactionDTO toDto(Transaction domain);
}
