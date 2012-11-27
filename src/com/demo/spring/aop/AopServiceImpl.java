package com.demo.spring.aop;

import javax.security.auth.login.AccountException;

import com.demo.spring.aop.IAopService;

public class AopServiceImpl implements IAopService {

	private String name;
	
	public void withAop() throws Exception {
		System.out.println("有Aop的函数运行，name " + name);
		if(name.trim().length() == 0){
			throw new AccountException("name 属性不能为空！");
		}
	}
	public void withoutAop() throws Exception {
		System.out.println("没有Aop的函数运行！");

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
