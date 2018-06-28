package com.patterns.singleton;

public class SingletonClass {
	private static SingletonClass instance;
	public String name;
	
	private SingletonClass(){
		
	}
	
	private static SingletonClass getInstance(){
		if(instance != null){
			return instance;
		}else{
			instance = new SingletonClass();
			return instance;
		}
	}
	
	public static void main(String[] args){
		SingletonClass obj1 = getInstance();
		obj1.name="Rahul";
		System.out.println("Obj1 name:"+ obj1.name);
		
		SingletonClass obj2 = getInstance();
		System.out.println("Obj2 name:"+ obj2.name);
		
		obj2.name="Megha";
		
		System.out.println("Obj2 name:"+ obj2.name);
		System.out.println("Obj1 name:"+ obj1.name);
	}

}
