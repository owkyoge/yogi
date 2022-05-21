package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AddressDao;
import com.example.pogo.Address;
import com.example.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressDao dao;
	
	@Override 
	public void save(Address add) {
		dao.save(add);
	}
	
	
	@Override
	public List<Address> findd() {

		return dao.find();
		
	}
	
	@Override
	public void updatee(Address add) {
		dao.update(add);
	}
	
	@Override
	public void delete(Address add) {
		dao.delete(add);
	}
	
	
	
}
