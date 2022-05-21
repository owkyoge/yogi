package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DepartmentDao;
import com.example.pogo.Department;
import com.example.pogo.Employee;
import com.example.service.DepartmentService;
@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentDao deptDao;
	
	
	@Override
	public void saveDeptt(Department dept) {
		deptDao.saveDept(dept);
	}
	
	@Override
	public List<Department> findAlll() {

		return deptDao.findAll();

	}
	

	@Override
	public void update(Department dept) {
		
		deptDao.update(dept);
	}
	
	@Override
	public void delete(Department dept) {
		
		deptDao.delete(dept);
	}
	
	
	
}
