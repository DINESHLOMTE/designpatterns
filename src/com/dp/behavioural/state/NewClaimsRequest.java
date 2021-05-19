package com.dp.behavioural.state;

public class NewClaimsRequest implements IClaims {
	
	public NewClaimsRequest() {
		System.out.println("New Claims Request");
	}
	
	@Override
	public void process(ClaimsContext claimsContext, User user) {
		System.out.println("New claims request received by: " + user.getRole());
		System.out.println("-------------------------------------------------");
		claimsContext.setiClaims(new DocumentsVarification());
		claimsContext.process(new User("Admin"));
	}
}