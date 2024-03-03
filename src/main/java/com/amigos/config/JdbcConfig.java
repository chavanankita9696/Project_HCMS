package com.amigos.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.amigos.dao.EmployeesDAO;
import com.amigos.dao.EmployeesDAOImpl;

public class JdbcConfig {

	@Bean(name = { "dataSourceObj" })
	public DataSource getDataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/hcms");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("JaiGanpati@8");
		return driverManagerDataSource;
	}

	@Bean(name = { "jdbcTemplate" })
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}

	@Bean(name = { "employeesDAO" })
	public EmployeesDAO getEmployeesDAO() {
		EmployeesDAOImpl employeesDAO = new EmployeesDAOImpl();
		employeesDAO.setJdbcTemplate(getJdbcTemplate());
		return employeesDAO;

	}

}
