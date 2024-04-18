package com.trio.praveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trio.praveen.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long>
{

}
