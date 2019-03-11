package com.threads.synchronization;

public class NumberByDigit {

	public static void main(String[] args) {
		int num = 8900;
		int count = 0;
        String input = String.valueOf(num);

        for(int i=0; i< input.length(); i++){
            int n = Integer.parseInt(input.charAt(i)+"");
            if(n==0 || n==6 || n==9){
                count = count +1;
            }else if(n==8){
                count = count+2;
            }
        }

        
        System.out.println(count);

	}

}
