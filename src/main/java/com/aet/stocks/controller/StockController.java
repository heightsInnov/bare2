package com.aet.stocks.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aet.stocks.model.Stocks;
import com.aet.stocks.service.StockService;

@RestController
@RequestMapping("/api")
public class StockController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	StockService service;
	
	@GetMapping(value = "/stocks")
	public @ResponseBody List<Stocks> getAllStocks() {
		logger.info("In getAllStocks");
		return service.findStocks();
	}

	@GetMapping(value = "/stocks/{id}")
	public @ResponseBody Stocks getSpecificStock(@PathVariable("id") int id) {
		logger.info("In getSpecificStock");
		return service.findSepcific(id);
	}
	
	@PutMapping(value = "/stocks/{id}")
	public @ResponseBody String UpdateStock(@PathVariable("id") int id, @RequestBody Stocks stock) {
		logger.info("In UpdateStock");
		stock.setId(id);
		return service.UpdateStock(stock);
	}
	
	@PostMapping(value = "/stocks")
	public @ResponseBody String CreateStock(@RequestBody Stocks stock) {
		logger.info("In UpdateStock");
		return service.UpdateStock(stock);
	}
}
