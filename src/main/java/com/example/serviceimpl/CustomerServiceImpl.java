package com.example.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CustomerDao;
import com.example.pogo.Customer;
import com.example.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao cusDao;

	@Override
	public void saveCuss(Customer c) {
		cusDao.saveCus(c);
	}

	@Override
	public void findd() {
		cusDao.find();
	}

	@Override
	public void updatee(Customer c) {
		cusDao.update(c);
	}

	@Override
	public void delete(Customer c) {

		cusDao.delete(c);
	}

}
