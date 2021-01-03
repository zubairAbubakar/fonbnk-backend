package com.fonbnk.backend.dao;

import com.fonbnk.backend.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
