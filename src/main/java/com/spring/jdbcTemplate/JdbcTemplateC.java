package com.spring.jdbcTemplate;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class JdbcTemplateC {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED)
	public void he() {
		String sql = "select count(type) from  goods ";
		Long queryForObject = jdbcTemplate.queryForObject(sql, long.class);
		System.out.println(queryForObject);
		String insertSql="insert into goods (type,goods_id,goods_name) values(?,?,?)";
		List<Object[]> list=new ArrayList<>();
		list.add(new Object[] {"1","1","2"});
		list.add(new Object[] {"1","2","2"});
		jdbcTemplate.batchUpdate(insertSql,list);
		
		int a=15/0;
		String updateSql="update goods set goods_name=? where type= ?";
		int update = jdbcTemplate.update(updateSql,"888","5555");
		System.out.println(update);
	}
	public static void main(String[] args) {
		ApplicationContext  ac=new ClassPathXmlApplicationContext("applicationContextTemplate.xml");
		//JdbcTemplate jdbcTemplate=(JdbcTemplate) ac.getBean("jdbcTemplate");
		JdbcTemplateC jdbcTemplateC=(JdbcTemplateC) ac.getBean("jdbcTemplateC");
		jdbcTemplateC.he();
	}

}
