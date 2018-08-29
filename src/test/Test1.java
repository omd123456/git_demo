package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import service.OrderService;


public class Test1 {
	@Test
	public void t1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		OrderService orderService = (OrderService)ac.getBean("orderService");
		
	//	orderService.getOrderList(map)£»
	}
}
