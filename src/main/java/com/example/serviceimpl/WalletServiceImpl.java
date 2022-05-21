package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.WalletDao;
import com.example.pogo.Wallet;
import com.example.service.WalletService;

@Service
public class WalletServiceImpl implements WalletService {

	@Autowired
	WalletDao dao;

	@Override
	public void save(Wallet wall) {
		dao.saveWall(wall);
	}

	@Override
	public List<Wallet> find() {
		return dao.find();
	}

	@Override
	public void update(Wallet wall) {
	//	dao.update(wall);
	}

	@Override
	public void delete(Wallet wall) {
		dao.delete(wall);
	}
}
