package com.oops;

public class AClass {
	
	private String name;
	private int age;
	protected int salary;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
	public int computeAge() {
		return this.age*10;
	}

}
