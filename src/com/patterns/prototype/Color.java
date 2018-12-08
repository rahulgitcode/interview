package com.patterns.prototype;

public abstract class Color implements Cloneable{
	
	protected String colorName;
	public abstract void addColor();
	
	@Override
	public Object clone() {
		Object clone = null;
		
		try {
			clone = super.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
	
	

}
