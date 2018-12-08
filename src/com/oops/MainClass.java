package com.oops;

public class MainClass {
	
	public static void main(String[] args) {
		//AAbstract abs = new AAbstract(); // Cannot instantiate abstract class
		
		AAbstract abs = new AImplements(); // instantiate through an class that implements it
		System.out.println(abs.checkIfUserExists("rahul"));
	}

}
