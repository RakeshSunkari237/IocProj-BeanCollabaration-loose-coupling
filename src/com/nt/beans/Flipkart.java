package com.nt.beans;

import java.util.Random;

public class Flipkart {

	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart 0-param constructor");
	}

	public Courier getCourier() {
		return courier;
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
	public String purchase(String items[]) {
		//generate order id
		Random random = new Random();
		int orderId = random.nextInt(4000);
		
		//deliver orderid
		String status = courier.deliver(orderId);
		return "Bill amount for orderId : "+orderId+" is 70000";
	}
	
	
}
