package com.spring.jdbcTemplate;



import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
public class TemplateMain {
	public static void main(String[] args) {
		ApplicationContext t=new ClassPathXmlApplicationContext("applicationContextTemplate.xml");
		DataSource ds = t.getBean(DataSource.class);
		try {
			System.out.println(ds.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
