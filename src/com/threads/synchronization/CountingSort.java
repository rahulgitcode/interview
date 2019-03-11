package com.threads.synchronization;

import java.util.Scanner;

public class CountingSort {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();

        int[] arr = new int[n];
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        String[] arrItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = countingSort(arr);
	}

	private static int[] countingSort(int[] arr) {
		int[] result = new int[100];
        int[] output = new int[100];

        for(int i=0; i< arr.length; i++){
            int num = arr[i];
            result[num] = result[num]+1;
        }
        
        int j = 0;
        for(int i=0; i<result.length; i++){
            int num = result[i];
            if(num==0){
                continue;
            }else{
                for(int k=0;k<num;k++){
                    output[j]=i;
                    j++;
                }
            }
        }
        return output;

	}

}
