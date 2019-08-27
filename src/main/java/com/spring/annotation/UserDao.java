package com.spring.annotation;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	public void helloUserDao() {
		System.out.println("userDao=====你好");
	}
}
