package com.demo.spring.simpleTest;

/**
 * 
 * @author jinhuawa
 * @version 1.0
 */
public class ServiceExample {

	private DaoExample daoExample= new DaoExample();
	
	public void service(String name){
		System.out.println(daoExample.sayHello(name));
	}
}
