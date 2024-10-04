package com.service.peoplemanagementservice.infrastructure.adapter.repository;

import com.service.peoplemanagementservice.infrastructure.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
    Optional<CustomerEntity> findCustomerByIdCard(String identificationNumber);
}
