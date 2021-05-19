package com.dp.structural.proxy;

public class TestProxy {
	public static void main(String[] args) {
		ProxyDataLoader proxyDataLoader = new ProxyDataLoader("PRIMARY_DATA");
		proxyDataLoader.display();
		proxyDataLoader.display();
		proxyDataLoader = new ProxyDataLoader("SECONDARY_DATA");
		proxyDataLoader.display();
		proxyDataLoader.display();
		proxyDataLoader.display();
	}
}