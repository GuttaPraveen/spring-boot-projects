package com.trio.praveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trio.praveen.entity.Passport;

@Repository
public interface PassportRepository extends JpaRepository<Passport,Integer> {

}
