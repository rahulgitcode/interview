package com.generics;

public class GenericsDoubleParam<T,V> {
	T var1;
	V var2;
	
	GenericsDoubleParam(T obj1,V obj2){
		this.var1 = obj1;
		this.var2 = obj2;
	}
	
	T getVar1(){
		return var1;
	}
	
	V getVar2(){
		return var2;
	}
	
	void showType(){
		System.out.println(var1.getClass().getName()+", "+ var2.getClass().getName());
	}
	
	public static void main(String[] args){
		GenericsDoubleParam<String, Integer> gen1 = new GenericsDoubleParam<String, Integer>("Rahul", 16);
		
		System.out.println(gen1.getVar1());
		System.out.println(gen1.getVar2());
		
		gen1.showType();
	}
}
