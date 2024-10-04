package com.service.accountsmovementsservice.domain.port;

import com.service.accountsmovementsservice.domain.entities.Account;

import java.util.List;

public interface AccountPersistencePort {
    Account save(Account account);
    Account findById(Long id);
    void deleteById(Long id);
    List<Account> findAll();
    Account update(Account account);
    List<Account> findByIdentification(String id);
    Account getAccountInformation(String accountNumber);
}
