package com.dp.structural.proxy;

public class ProxyDataLoader {
	
	private String name;
	private DataLoader dataLoader;
	
	public ProxyDataLoader() {
	}
	
	public ProxyDataLoader(String name) {
		this.name = name;
	}

	public void display() {
		if (dataLoader == null) {
			dataLoader = new DataLoader(name);
		}
		dataLoader.display();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DataLoader getDataLoader() {
		return dataLoader;
	}

	public void setDataLoader(DataLoader dataLoader) {
		this.dataLoader = dataLoader;
	}
}