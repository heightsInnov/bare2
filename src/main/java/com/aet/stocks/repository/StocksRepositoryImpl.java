package com.aet.stocks.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.aet.stocks.model.Stocks;

@Repository(value = "StocksRepository")
public class StocksRepositoryImpl implements StocksRepository {

	@Autowired
    JdbcTemplate jdbcTemplate;


	@Override
	public Stocks findById(int id) {
	    return jdbcTemplate.queryForObject("select * from Stocks where id=?", new Object[] {
	            id
	        },
	        new BeanPropertyRowMapper<Stocks>(Stocks.class));
	}
	
	class StocksRowMapper implements RowMapper<Stocks > {
	    @Override
	    public Stocks mapRow(ResultSet rs, int rowNum) throws SQLException {
	    	Stocks stock = new Stocks();
	        stock.setId(rs.getInt("id"));
	        stock.setName(rs.getString("name"));
	        stock.setCurrentPrice(rs.getFloat("currentPrice"));
	        stock.setCreateDate(rs.getTimestamp("createDate"));
	        stock.setLastUpdate(rs.getTimestamp("lastUpdate"));
	        return stock;
	    }
	}

	@Override
	public List<Stocks> findAll() {
	    return jdbcTemplate.query("select * from stocks", new StocksRowMapper());
	}

	@Override
	public int insert(Stocks Stocks) {
	    return jdbcTemplate.update("insert into Stocks (id, name, currentPrice, createDate) " + "values(?,?,?,?)",
	        new Object[] {
	            Stocks.getId(), Stocks.getName(), Stocks.getCurrentPrice(), Stocks.getCreateDate()
	        });
	}
	
	@Override
	public int update(Stocks Stocks) {
	    return jdbcTemplate.update("update Stocks " + " set name = ?, currentPrice = ?, lastUpdate = ? " + " where id = ?",
	        new Object[] {
	            Stocks.getName(), Stocks.getCurrentPrice(), Stocks.getLastUpdate(), Stocks.getId()
	        });
	}
}
