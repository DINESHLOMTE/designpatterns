package com.dp.behavioural.mediator;

import java.util.Arrays;

public class TestMediator {
	
	public static void main(String[] args) {
		StockMarketMediator stockMarketMediator = new StockMarketMediator();
		
		stockMarketMediator.getShares().addAll(Arrays.asList(
				new Share("BUY", 10000, "ABC Co.", stockMarketMediator),
				new Share("BUY", 50000, "XYZ Co.", stockMarketMediator),
				new Share("SELL", 5000, "ABC Co.", stockMarketMediator)));
		
		stockMarketMediator.processTransaction();
	}
}