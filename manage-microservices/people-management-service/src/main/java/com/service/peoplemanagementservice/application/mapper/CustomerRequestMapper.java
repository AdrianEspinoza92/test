package com.service.peoplemanagementservice.application.mapper;

import com.service.peoplemanagementservice.domain.entities.Customer;
import com.service.peoplemanagementservice.domain.dto.request.CustomerRequestDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerRequestMapper {
    @Mapping(source = "name", target = "name")
    @Mapping(source = "gender", target = "gender")
    @Mapping(source = "age", target = "age")
    @Mapping(source = "idCard", target = "idCard")
    @Mapping(source = "address", target = "address")
    @Mapping(source = "phone", target = "phone")
    @Mapping(source = "password", target = "password")
    @Mapping(source = "status", target = "status")
    Customer toDomain(CustomerRequestDTO customer);
}