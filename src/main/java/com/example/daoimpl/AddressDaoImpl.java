package com.example.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.dao.AddressDao;
import com.example.pogo.Address;

@Repository
public class AddressDaoImpl implements AddressDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void save(Address add) {

		jdbcTemplate.update("INSERT INTO Address (id, village, mandal, dist, state) VALUES (?, ?, ?, ?, ?)", add.getId(), add.getVillage(), add.getMandal(), add.getDist(), add.getState());
	}
	
	@Override
	public List<Address> find() {
	return	jdbcTemplate.query("SELECT * FROM Address", new BeanPropertyRowMapper<Address>(Address.class));
	}
	
	@Override
	public void update(Address add) {
		jdbcTemplate.update("UPDATE Address SET village = ? WHERE id = ?", add.getVillage(), add.getId());
	}
	
	@Override
	public void delete(Address add) {
		jdbcTemplate.update("DELETE Address where id = ?", add.getId());
		
	}
}
