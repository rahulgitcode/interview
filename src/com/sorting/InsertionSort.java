package com.sorting;

public class InsertionSort {
	
	static void insertionSort1(int n, int[] arr) {
        int num = arr[n-1];
        int i;
        for(i=n-2; i>=0; i--){
            if(num<arr[i]){
                arr[i+1]=arr[i];
                printArr(arr);
                if(i==0) {
                	arr[1]=arr[0];
                	arr[0]=num;
                	printArr(arr);
                }
            }else{
                arr[i+1] = num;
                printArr(arr);
                break;
            }
        }        
        
    }

    private static void printArr(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
    	int[] arr = {2,3,4,5,6,7,8,9,10,1};
    	insertionSort1(arr.length, arr);
    }

}
