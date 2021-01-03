package com.fonbnk.backend.dao;

import com.fonbnk.backend.entity.Transaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    Page<Transaction> findByAmountContainingAndSenderNumberContainingAndStatusContaining(@RequestParam("amount") String amount,
                                                                                         @RequestParam("senderNumber") String senderNumber,
                                                                                         @RequestParam("status") String status,
                                                                                         Pageable pageable);
}
