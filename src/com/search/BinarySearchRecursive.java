package com.search;

public class BinarySearchRecursive {
	
	public static boolean searchRecursive(int[] arr, int x, int left, int right) {
			if(left>right) {
				return false;
			}
			int mid = left+((right-left)/2);
			
			if(arr[mid]==x) {
				return true;
			}else if(x>arr[mid]) {
				return searchRecursive(arr,x, mid+1,right);
			}else {
				return searchRecursive(arr,x, left,mid-1);
			}
			
	}
	
	public static void main(String[] args) {
		int[] arr = {2,5,7,9,14,19,54,69,103,150};
		
		boolean found = searchRecursive(arr, 150, 0, arr.length);
		
		System.out.println(found);
	}

}
