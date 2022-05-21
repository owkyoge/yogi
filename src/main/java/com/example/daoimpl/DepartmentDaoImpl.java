package com.example.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.dao.DepartmentDao;
import com.example.pogo.Department;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void saveDept(Department dept) {
		jdbcTemplate.update("INSERT INTO Department (id , name) VALUES (? , ?)", dept.getId(), dept.getName());
	}

	@Override
	public List<Department> findAll() {
		return jdbcTemplate.query("SELECT * FROM Department", new BeanPropertyRowMapper<Department>(Department.class));

	}

	@Override
	public void update(Department dept) {
		jdbcTemplate.update("UPDATE Department SET name = ? WHERE id = ? ", dept.getName(), dept.getId());
	}

	@Override
	public void delete(Department dept) {
		jdbcTemplate.update("DELETE Department where id = ?", dept.getId());
	}

}
