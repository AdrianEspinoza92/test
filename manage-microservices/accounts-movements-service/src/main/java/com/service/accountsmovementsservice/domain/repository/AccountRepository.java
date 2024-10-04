package com.service.accountsmovementsservice.domain.repository;

import com.service.accountsmovementsservice.infraestructure.entities.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<AccountEntity,Long> {
    Optional<AccountEntity> findAccountByAccountNumber(String account);
    @Query(value = "select m from AccountEntity m where m.idCustomer = ?1")
    List<AccountEntity> findAccountByIdentification(String account);

}
