package com.generics;

public class Generics<V> {
	
	V ob;
	
	Generics(V ob){
		this.ob = ob;
	}
	
	void showObType(){
		System.out.println("The Ob type is "+ob.getClass().getName());
	}

	public static void main(String[] args) {

		Generics<Integer> a;
		a= new Generics<Integer>(33);
		a.showObType();
		
		Generics<String> b;
		b= new Generics<String>("Rahul");
		b.showObType();

	}

}
