package com.example.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.dao.CustomerDao;
import com.example.pogo.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void saveCus(Customer c) {
		jdbcTemplate.update("INSERT INTO Customer (id, name, salary, phNo) VALUES (?, ?, ?, ?)", c.getId(), c.getName(),
				c.getSalary(), c.getPhNo());
	}

	@Override
	public void find() {
		jdbcTemplate.query("SELECT * FROM Customer", new BeanPropertyRowMapper(Customer.class));
	}

	@Override
	public void update(Customer c) {
		jdbcTemplate.update("UPDATE Customer SET name = ? WHERE id = ?", c.getName(), c.getId());
	}

	@Override
	public void delete(Customer c) {
		jdbcTemplate.update("DELETE Customer where id = ?", c.getId());

		
	}

}
