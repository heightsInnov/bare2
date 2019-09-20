package com.aet.stocks.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.aet.stocks.model.Stocks;

public class StockRowMapper implements RowMapper<Stocks> {
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
