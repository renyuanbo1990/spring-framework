package com.jd.jdd.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author renyuanbo3
 * @desc
 * @since 2021/3/29 6:34 下午
 */
public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("demo.xml");
		Person person = classPathXmlApplicationContext.getBean(Person.class);
		System.out.println(person);
	}
}
