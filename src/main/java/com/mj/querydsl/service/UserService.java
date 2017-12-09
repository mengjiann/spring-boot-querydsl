package com.mj.querydsl.service;

import com.mj.querydsl.domain.Admin;
import com.mj.querydsl.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    List<User> findUsersByUsernameAndEmail(String username, String email);

    List<Admin> findAdminByUsernameAndEmail(String username, String email);

}