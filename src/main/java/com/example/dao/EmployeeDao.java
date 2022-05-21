package com.example.dao;

import java.util.List;

import com.example.pogo.Employee;

public interface EmployeeDao {

	public List<Employee> findAll();

	void saveEmp(Employee e);

	void update(Employee e);

	void delete(Employee e); 
	
}
