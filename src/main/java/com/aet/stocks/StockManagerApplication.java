package com.aet.stocks;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aet.stocks.repository.StocksRepository;

@SpringBootApplication
public class StockManagerApplication{

	
    @Autowired
    StocksRepository repository;
    
	public static void main(String[] args) {
		SpringApplication.run(StockManagerApplication.class, args);
	}

}
