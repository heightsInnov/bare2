package com.aet.stocks.model;

import java.sql.Timestamp;

public class Stocks {

	private int id;
	private String name;
	private float currentPrice;
	private Timestamp createDate;
	private Timestamp lastUpdate;
	
	public Stocks() {
        super();
    }
	
	public Stocks(int id, String name, float currentPrice, Timestamp createDate, Timestamp lastUpdate) {
		super();
		this.id = id;
		this.name = name;
		this.currentPrice = currentPrice;
		this.createDate = createDate;
		this.lastUpdate = lastUpdate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(float currentPrice) {
		this.currentPrice = currentPrice;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public Timestamp getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
}
