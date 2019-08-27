package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userSerivce")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	public void helloServie() {
		// TODO Auto-generated method stub
		System.out.println("userService=====你好");
		userDao.helloUserDao();
	}

}
