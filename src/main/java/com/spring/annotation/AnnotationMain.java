package com.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");
		UserController userController = (UserController) ac.getBean("userController");
		userController.helloUserController();
		UserService userService = (UserService) ac.getBean("userSerivce");
		userService.helloServie();
		UserDao userDao=(UserDao) ac.getBean("userDao");
		userDao.helloUserDao();
		TextObject textObject = ac.getBean(TextObject.class);
		textObject.helloTextObject();
	}
}
