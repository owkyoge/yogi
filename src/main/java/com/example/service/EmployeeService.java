package com.example.service;

import java.util.List;

import com.example.pogo.Employee;

public interface EmployeeService {

	List<Employee> findAlll();

	void saveEmpl(Employee e);

	void update(Employee e);

	void delete(Employee e);

}
