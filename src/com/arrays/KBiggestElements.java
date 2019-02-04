package com.arrays;

import java.util.Arrays;
import java.util.Collections;

public class KBiggestElements {
	public static void main(String[] args) {
		Integer[] arr = {1, 23,50, 12, 9, 30, 2, 50};
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
	}
}
