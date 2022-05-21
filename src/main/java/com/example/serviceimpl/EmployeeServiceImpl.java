package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDao;
import com.example.pogo.Employee;
import com.example.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao dao;

	@Override
	public List<Employee> findAlll() {

		return dao.findAll();

	}

	@Override
	public void saveEmpl(Employee e) {

		dao.saveEmp(e);
	}
	
	@Override
	public void update(Employee e) {
		
		dao.update(e);
	}


	@Override
	public void delete(Employee e) {
		
		dao.delete(e);
	}

}
