package com.dp.behavioural.mediator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StockMarketMediator {
	
	private String status;
	private List<Share> shares;
	
	public StockMarketMediator() {
	}
	
	public void processTransaction() {
		if (getShares().isEmpty()) {
			System.out.println("No transactions exist to process.");
			return;
		}
		for (Share share : getShares()) {
			Optional.ofNullable(share).ifPresent(oShare -> {
				System.out.println("-------------------------------------------------------------");
				if (!Arrays.asList("BUY", "SELL").contains(oShare.getType())) {
					return;
				}
				if (oShare.getType().equals("BUY")) {
					buy(share);
					return;
				}
				sell(share);
			});
		}
	}
	
	private void buy(Share share) {
		updateStatus(share);
	}

	private void sell(Share share) {
		updateStatus(share);
	}
	
	private void updateStatus(Share share) {
		Optional.ofNullable(share).ifPresent(oShare -> {
			share.getStockMarketMediator().setStatus(
					buildStatusMessage(share, "Processing"));
			share.displayStatus();
			share.getStockMarketMediator().setStatus(
					buildStatusMessage(share, "Processed"));
			share.displayStatus();
			
		});
	}

	private String buildStatusMessage(Share share, String message) {
		return new StringBuilder(message).append(" request to '").append(share.getType())
			.append("' ").append(share.getNumber()).append(" shares of '")
			.append(share.getName()).append("' company").toString();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Share> getShares() {
		return (shares == null) ? shares = new ArrayList<>() : shares;
	}

	public void setShares(List<Share> shares) {
		this.shares = shares;
	}
}