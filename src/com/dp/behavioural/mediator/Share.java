package com.dp.behavioural.mediator;

public class Share {
	
	private String type;
	private int number;
	private String name;
	private StockMarketMediator stockMarketMediator;
	
	public Share() {
	}

	public Share(String type, int number, String name, StockMarketMediator stockMarketMediator) {
		this.type = type;
		this.number = number;
		this.name = name;
		this.stockMarketMediator = stockMarketMediator;
	}

	public void displayStatus() {
		System.out.println(stockMarketMediator.getStatus());
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StockMarketMediator getStockMarketMediator() {
		return (stockMarketMediator == null) 
				? stockMarketMediator = new StockMarketMediator() : stockMarketMediator;
	}

	public void setStockMarketMediator(StockMarketMediator stockMarketMediator) {
		this.stockMarketMediator = stockMarketMediator;
	}
}