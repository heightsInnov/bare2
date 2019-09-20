package com.aet.stocks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aet.stocks.model.Stocks;
import com.aet.stocks.repository.StocksRepository;

@Service(value ="StockService")
public class StockServiceImpl implements StockService {
	
	@Autowired
	StocksRepository repository;
	
	@Override
	public Stocks findSepcific(int id) {
		return repository.findById(id);
	}
	@Override
	public List<Stocks> findStocks() {
		return repository.findAll();
	}
	@Override
	public String CreateStock(Stocks stock) {
		return repository.insert(stock)==1?"Successfull":"Error creating new stock";
	}
	@Override
	public String UpdateStock(Stocks stock) {
		return repository.update(stock)==1?"Successfull":"Error creating new stock";
	}
}
