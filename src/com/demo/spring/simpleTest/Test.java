package com.demo.spring.simpleTest;

/**
 * 
 * @author jinhuawa
 * @version 1.0
 */
public class Test {

	public static void main(String []args){
		String name = "Spring";
		ServiceExample service = new ServiceExample();
		
		service.service(name);
	}
}
