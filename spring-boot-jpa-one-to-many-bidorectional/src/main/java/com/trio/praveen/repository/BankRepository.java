package com.trio.praveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trio.praveen.entity.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank,Long>
{
    
}
