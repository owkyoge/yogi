package com.example.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.dao.EmployeeDao;
import com.example.pogo.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> findAll() {
		List<Employee> query = jdbcTemplate.query("SELECT * FROM employee",
				new BeanPropertyRowMapper<Employee>(Employee.class));
		return query;
	}

	@Override
	public void saveEmp(Employee e) {

		Long id = e.getId();
		String name = e.getName();
		String location = e.getLocation();

		jdbcTemplate.update("INSERT INTO employee (id , name , location) VALUES (? , ? , ?)", id, name, location);

	}

	@Override
	public void update(Employee e) {
		jdbcTemplate.update("UPDATE employee SET name = ? WHERE id = ? ",  e.getName() , e.getId());
	}

	@Override
	public void delete(Employee e) {
		jdbcTemplate.update("DELETE employee where id = ?", e.getId());
	}
}
