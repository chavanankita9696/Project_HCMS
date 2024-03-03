package com.amigos.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.amigos.config.JdbcConfig;
import com.amigos.entities.Employees;

public class EmployeesDAOImpl implements EmployeesDAO {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Employees> getAllEmployees() {
		// TODO Auto-generated method stub
		// return this.getJdbcTemplate().queryForList("select * from employees");
		System.out.println("running..'");
		return null;
	}

	public EmployeesDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * public static void main(String[] args) { ApplicationContext ctx = new
	 * AnnotationConfigApplicationContext(JdbcConfig.class); EmployeesDAO
	 * employeesDAO = ctx.getBean("employeesDAO", EmployeesDAO.class);
	 * employeesDAO.getAllEmployees(); }
	 */

}
