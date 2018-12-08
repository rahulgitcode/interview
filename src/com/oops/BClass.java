package com.oops;

public class BClass extends AClass{
	
	private int salary;
	
	public int getSalary(boolean x) {
		if(x) {
			return super.salary;
		}
		return salary;
	}

	public void setSalary(int salary) {
		super.salary = 5000;
		this.salary = salary;
	}

	public int computeSalary() {
		return 10000;
	}
	
	public int computeAge(boolean x) {
		if(x) {
			return super.computeAge();
		}
		return this.getAge();
	}
	
	public static void main(String[] args) {
		
		BClass obj = new BClass();
		
		obj.setSalary(10000);
		obj.setAge(10);
		obj.setName("Rahul");
		
		System.out.println(obj.computeAge(true));
		System.out.println(obj.computeAge(false));
		
		System.out.println(obj.getSalary(true));
		System.out.println(obj.getSalary(false));
		
	}
}
