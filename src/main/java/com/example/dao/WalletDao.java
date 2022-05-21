package com.example.dao;

import java.math.BigDecimal;
import java.util.List;

import com.example.pogo.SenderReciver;
import com.example.pogo.Wallet;

public interface WalletDao {

	void saveWall(Wallet wall);

	List<Wallet> find();

	void delete(Wallet wall);

	List<SenderReciver> findd();

	void update(Long accNo, BigDecimal amt);

}
