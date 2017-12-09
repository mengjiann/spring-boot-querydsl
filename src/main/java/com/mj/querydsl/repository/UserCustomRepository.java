package com.mj.querydsl.repository;

import com.mj.querydsl.domain.User;

import java.util.List;

public interface UserCustomRepository {

    List<User> findUserByUsernameAndEmail(String username, String email);

}
