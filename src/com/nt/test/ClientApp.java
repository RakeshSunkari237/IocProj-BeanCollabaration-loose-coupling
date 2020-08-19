package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Flipkart;

public class ClientApp {

	public static void main(String[] args) {
		System.out.println("Client app main method-----");
		//create Ioc container
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get bean
		Flipkart bean = ac.getBean("fpkart", Flipkart.class);
		
		String billMsg= bean.purchase(new String[] {"tshirt", "jeans", "trousers"});
		System.out.println(billMsg);
	}
}
