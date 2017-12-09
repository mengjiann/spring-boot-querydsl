package com.mj.querydsl;

import com.mj.querydsl.domain.Admin;
import com.mj.querydsl.domain.User;
import com.mj.querydsl.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@Slf4j
@SpringBootApplication
public class QuerydslApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(QuerydslApplication.class, args);
	}

	@Autowired
	private UserService userService;

	@Override
	public void run(String... strings) throws Exception {
		// Test code

		List<Admin> admins =  userService.
				findAdminByUsernameAndEmail("steve_jobs","sjobs@apple.com");

		List<User> users = userService.
				findUsersByUsernameAndEmail("jeff_bezos","jbezos@amazon.com");


		log.info("{}",admins.toString());
		log.info("{}",users.toString());

	}
}
