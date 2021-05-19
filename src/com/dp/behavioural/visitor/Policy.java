package com.dp.behavioural.visitor;

import java.util.Arrays;
import java.util.Optional;

public class Policy implements IPolicy {
	
	public Policy() {
	}
	
	@Override
	public void accept(IVisitor iVisitor) {
		Optional.ofNullable(iVisitor).ifPresent(oVisitor -> {
			oVisitor.visit(this);
			Arrays.asList(new PolicyHolder()).forEach(
					iPolicy -> iPolicy.accept(iVisitor));
		});
	}
}