package com.search;

public class BinarySearchIterative {
	
	public static boolean searchIterative(int[] arr, int x) {
		int left=0;
		int right = arr.length-1;
		
		while(left<=right) {
			int mid = left+((right-left)/2);
			
			if(arr[mid]==x) {
				return true;
			}else if(x>arr[mid]) {
				left = mid+1;
			}else {
				right= mid-1;
			}
		}
		return false;		
		
	}
	
	public static void main(String[] args) {
		int[] arr = {2,5,7,9,14,19,54,69,103,150};
		
		boolean found = searchIterative(arr, 151);
		
		System.out.println(found);
	}
	
}
