package com.dp.behavioural.state;

public class DocumentsVarification implements IClaims {
	
	public DocumentsVarification() {
		System.out.println("Documents Varification");
	}
	
	@Override
	public void process(ClaimsContext claimsContext, User user) {
		System.out.println("Claims specific documents received by: " + user.getRole());
	}
}