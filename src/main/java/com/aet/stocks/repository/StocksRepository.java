package com.aet.stocks.repository;

import java.util.List;

import com.aet.stocks.model.Stocks;

public interface StocksRepository {

	Stocks findById(int id);

	List<Stocks> findAll();

	int insert(Stocks Stocks);

	int update(Stocks Stocks);

}