package com.dp.behavioural.state;

import java.util.Optional;

public class ClaimsContext {
	
	private IClaims iClaims;
	
	public ClaimsContext() {
		iClaims = new NewClaimsRequest();
	}
	
	public ClaimsContext(IClaims iClaims) {
		this.iClaims = iClaims;
	}
	
	public void process(User user) {
		Optional.ofNullable(user).ifPresent(
				optional -> iClaims.process(this, user));
	}

	public IClaims getiClaims() {
		return iClaims;
	}

	public void setiClaims(IClaims iClaims) {
		this.iClaims = iClaims;
	}
}