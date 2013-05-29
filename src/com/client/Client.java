package com.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext content = 
				new ClassPathXmlApplicationContext(new String []{"com/client/client_bean.xml"});
		IHello client = (IHello)content.getBean("greetingHello2");
		List list = new ArrayList();
		list.add("Max");
		list.add("kevie");
		list.add("bill");
		
		String response =  client.geetList(list);
		System.out.println("Response: " + response);
		System.exit(0);
	}

}
