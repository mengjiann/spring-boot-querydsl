package com.mj.querydsl.repository;

import com.mj.querydsl.domain.Admin;
import com.mj.querydsl.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {

    List<Admin> findByUsernameAndEmail(String username, String email);

}
