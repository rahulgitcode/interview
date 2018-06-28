package com.patterns.factory;

public class MainClass {
	
	public static void main(String[] args){
		ComputerFactory factory = new ComputerFactory();
		
		Computer computer1 = factory.getComputer("Mac");
		System.out.println(computer1.getOperatingSystem());
		
		Computer computer2 = factory.getComputer("HP");
		System.out.println(computer2.getOperatingSystem());
	}

}
