package com.sorting;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] arr = {1, 23,50, 12, 9, 30, 2, 50};
		int left =0;
		int right = arr.length-1;
		quicksort(arr,left,right);
		
		for(int i=0; i<arr.length; i++)
		System.out.println(arr[i]);
		
	}
	
	public static void quicksort(int[] arr, int left, int right) {
		if(left>=right) {
			return;
		}
		int pivot = arr[(left+right)/2];
		
		int index = findPartition(arr, left, right, pivot);
		quicksort(arr,left,index-1);
		quicksort(arr,index,right);
	}

	private static int findPartition(int[] arr, int left, int right, int pivot) {
		while(left<=right) {
			while(arr[left]<pivot) {
				left++;
			}
			
			while(arr[right]>pivot) {
				right--;
			}
			
			if(left<=right) {
				swap(arr,left,right);
				left++;
				right--;
			}
		}
		return left;
	}

	private static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

}
