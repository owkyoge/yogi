package com.example.daoimpl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.dao.WalletDao;
import com.example.pogo.SenderReciver;
import com.example.pogo.Wallet;

@Repository
public class WalletDaoImpl implements WalletDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void saveWall(Wallet wall) {

		jdbcTemplate.update(
				"INSERT INTO Wallet (id, accNo, accName, amt, isActive, createdBy, creadtedDated) VALUES (?, ?, ?, ?, ?, ?, ?)",
				wall.getId(), wall.getAccNo(), wall.getAccName(), wall.getAmt(), wall.getIsActive(),
				wall.getCreatedBy(), wall.getCreadtedDated());
	}

	@Override
	public List<Wallet> find() {
		return jdbcTemplate.query("SELECT * FROM Wallet", new BeanPropertyRowMapper<Wallet>(Wallet.class));
	}

	@Override
	public void update(Long accNo, BigDecimal amt) {
		String s = "UPDATE Wallet Set Amt = ? where accNo = ?";
		jdbcTemplate.update(s, amt , accNo);

		System.out.println(s);
	}

	@Override
	public void delete(Wallet wall) {
		jdbcTemplate.update("DELETE Wallet WHERE id = ?", wall.getId());

	}

	@Override
	public List<SenderReciver> findd() {
		List<SenderReciver> query = jdbcTemplate.query("SELECT * FROM Wallet",
				new BeanPropertyRowMapper<SenderReciver>(SenderReciver.class));
		return query;

	}

}
