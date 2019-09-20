package com.aet.stocks.service;

import java.util.List;

import com.aet.stocks.model.Stocks;

public interface StockService {

	Stocks findSepcific(int id);

	List<Stocks> findStocks();

	String CreateStock(Stocks stock);

	String UpdateStock(Stocks stock);

}