package com.sarje;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sarje.comp.MyBean;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
		MyBean mb = (MyBean) appCntx.getBean("my");
		System.out.println(mb);
		MyBean mb1 = (MyBean) appCntx.getBean("my");
		System.out.println(mb1);
		
	}

}
