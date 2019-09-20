package com.aet.stocks;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aet.stocks.repository.StocksRepository;

@SpringBootApplication
public class StockManagerApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    StocksRepository repository;
    
	public static void main(String[] args) {
		SpringApplication.run(StockManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Stocks id 1 -> {}", repository.findById(1));
	}

}
