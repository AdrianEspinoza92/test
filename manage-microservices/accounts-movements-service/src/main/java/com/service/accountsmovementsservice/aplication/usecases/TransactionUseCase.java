package com.service.accountsmovementsservice.aplication.usecases;

import com.service.accountsmovementsservice.domain.dto.TransactionDTO;
import com.service.accountsmovementsservice.domain.dto.TransactionsDTO;
import com.service.accountsmovementsservice.domain.dto.request.TransactionRequestDTO;
import com.service.accountsmovementsservice.domain.dto.CustomerDTO;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface TransactionUseCase {
    TransactionDTO createTransaction(TransactionRequestDTO transactionRequestDTO) throws Exception;
    TransactionDTO updateTransaction(Long id,TransactionRequestDTO transactionRequestDTO);
    TransactionDTO getTransactionById(Long transactionId);
    List<TransactionDTO> getTransactions();
    void deleteTransaction(Long transactionId);
    BigDecimal getBalance(String accountNumber);
    List<TransactionsDTO> getMovementsByUserAndDate(LocalDate initDate, LocalDate finalDate, CustomerDTO customer);

}
