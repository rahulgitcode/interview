package com.patterns.singleton;
/*
 * Lazy initialization of singleton
 */
public class SingletonClassLazy {
	private static SingletonClassLazy instance;
	public String name;
	
	private SingletonClassLazy(){
		
	}
	
	private static SingletonClassLazy getInstance(){
		if(instance != null){
			return instance;
		}else{
			instance = new SingletonClassLazy();
			return instance;
		}
	}
	
	public static void main(String[] args){
		SingletonClassLazy obj1 = getInstance();
		obj1.name="Rahul";
		System.out.println("Obj1 name:"+ obj1.name);
		
		SingletonClassLazy obj2 = getInstance();
		System.out.println("Obj2 name:"+ obj2.name);
		
		obj2.name="Megha";
		
		System.out.println("Obj2 name:"+ obj2.name);
		System.out.println("Obj1 name:"+ obj1.name);
	}

}
