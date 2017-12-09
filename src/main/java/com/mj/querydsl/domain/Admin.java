package com.mj.querydsl.domain;

import com.mysema.query.annotations.QueryExclude;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Slf4j
@ToString
@NoArgsConstructor

// This will exclude the querydsl from scanning the JPA entity
@QueryExclude

@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "admin_id")
    private Long id;


    @Column(name = "username")
    private String username;


    @Column(name = "email")
    private String email;

}
