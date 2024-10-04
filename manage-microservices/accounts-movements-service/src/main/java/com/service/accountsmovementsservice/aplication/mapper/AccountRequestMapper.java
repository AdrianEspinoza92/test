package com.service.accountsmovementsservice.aplication.mapper;

import com.service.accountsmovementsservice.domain.dto.request.AccountRequestDTO;
import com.service.accountsmovementsservice.domain.entities.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AccountRequestMapper {
    @Mapping(source = "accountNumber", target = "accountNumber")
    @Mapping(source = "accountType", target = "accountType")
    @Mapping(source = "initialBalance", target = "initialBalance")
    @Mapping(source = "status", target = "status")
    @Mapping(source = "customer", target = "customer")
    Account toDomain(AccountRequestDTO accountRequestDTO);
}
