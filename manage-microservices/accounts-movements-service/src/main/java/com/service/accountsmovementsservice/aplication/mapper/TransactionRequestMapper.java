package com.service.accountsmovementsservice.aplication.mapper;

import com.service.accountsmovementsservice.domain.dto.request.TransactionRequestDTO;
import com.service.accountsmovementsservice.domain.entities.Transaction;
import com.service.accountsmovementsservice.domain.entities.Transactions;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TransactionRequestMapper {
    @Mapping(source = "idAccount", target = "idAccount")
    @Mapping(source = "account", target = "account")
    @Mapping(source = "transactionType", target = "transactionType")
    @Mapping(source = "value", target = "value")
    Transaction toDomain(TransactionRequestDTO account);
}
