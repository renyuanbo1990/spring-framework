package com.jd.jdd.bean;

/**
 * @author renyuanbo3
 * @desc
 * @since 2021/3/29 6:33 下午
 */
public class Person {
	private String name;

	private int age;

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
