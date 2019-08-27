package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	public void helloUserController() {
		
		System.out.println("userController===你好");
		userService.helloServie();
	}
}
