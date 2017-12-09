package com.mj.querydsl.repository;

import com.mj.querydsl.domain.QUser;
import com.mj.querydsl.domain.User;
import com.mysema.query.jpa.impl.JPAQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserCustomRepositoryImpl implements UserCustomRepository{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> findUserByUsernameAndEmail(String username, String email) {

        QUser qUser  = QUser.user;

        JPAQuery query = new JPAQuery(entityManager).from(qUser);

        if(username != null && !username.isEmpty()){
            query.where(qUser.username.containsIgnoreCase(username));
        }

        if(email != null && !email.isEmpty()){
            query.where(qUser.email.containsIgnoreCase(email));
        }

        return query.list(qUser);
    }
}
