package com.aet.stocks.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.aet.stocks.model.Stocks;

@Repository
public class StocksRepository {

	@Autowired
    JdbcTemplate jdbcTemplate;
	
	public Stocks findById(int id) {
	    return jdbcTemplate.queryForObject("select * from Stocks where id=?", new Object[] {
	            id
	        },
	        new BeanPropertyRowMapper<Stocks>(Stocks.class));
	}
}
