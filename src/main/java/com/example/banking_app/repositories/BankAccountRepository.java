package com.example.banking_app.repositories;

import com.example.banking_app.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}