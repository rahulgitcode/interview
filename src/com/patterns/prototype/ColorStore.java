package com.patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {
	
	private static Map<String, Color> colorMap = new HashMap<String, Color>();
	
	static {
		colorMap.put("blue", new BlueColor());
		colorMap.put("black", new BlackColor());
	}
	
	public static Color getColor(String color) {
		return (Color) colorMap.get(color).clone();
	}

}
