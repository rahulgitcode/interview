package com.exception;

public class MyException extends Exception{
	
	public MyException(String s) {
		super(s);
	}
	
	public static void main(String[] args) {
		try {
			throw new MyException("Hola this my custom exception!!!");
		}catch(MyException e) {
			System.out.println("Caught the exception---");
			System.out.println(e.getMessage());
		}
	}

}
