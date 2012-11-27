package com.demo.spring.simpleTest;

import java.util.Calendar;

/**
 * 
 * @author jinhuawa
 * @version 1.0
 */
public class DaoExample {
	public String sayHello(String name){
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		if(hour < 12) return "good,moring! " + name;
		if(hour < 18) return "good,afternoon! " + name;
		return "good,night! " + name;
	}
}
