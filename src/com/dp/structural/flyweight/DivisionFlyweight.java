package com.dp.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DivisionFlyweight {
	
	private Map<String, IDivision> divisions;
	
	public DivisionFlyweight() {
		divisions = new HashMap<>();
	}

	public IDivision getDivision(String name) {
		if (name == null || name.trim().isEmpty()) {
			return null;
		}
		if (divisions.containsKey(name)) {
			return divisions.get(name);
		}
		IDivision iDivision = new Division(name);
		divisions.put(name, iDivision);
		return iDivision;
	}
	
	public Map<String, IDivision> getDivisions() {
		return divisions;
	}

	public void setDivisions(Map<String, IDivision> divisions) {
		this.divisions = divisions;
	}
}