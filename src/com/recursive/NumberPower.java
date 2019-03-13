package com.recursive;

public class NumberPower {
	
	public static void main(String[] args) {
		int X= 100, N=2;
		int result = checkRecursive(X, N, 1, 0);
		System.out.println(result);
	}

	static int power(int num, int n)  
	{  
	    if (n == 0)  
	        return 1;  
	    else if (n % 2 == 0)  
	        return power(num, n / 2) * power(num, n / 2);  
	    else
	        return num * power(num, n / 2) * power(num, n / 2);  
	}  
	  
	// Function to check power representations recursively  
	static int checkRecursive(int x, int n, int curr_num,int curr_sum)  
	{  
	    // Initialize number of ways to express  
	    // x as n-th powers of different natural  
	    // numbers  
	    int results = 0;  
	  
	    // Calling power of 'i' raised to 'n'  
	    int p = power(curr_num, n);
	    
	    //System.out.println("Curr_num="+ curr_num+" power="+ p+ " curr_sum="+ curr_sum);
	    while (p + curr_sum < x)  
	    {  
	        // Recursively check all greater values of i  
	        results += checkRecursive(x, n, curr_num + 1,  
	                                        p + curr_sum);  
	        curr_num++;  
	        p = power(curr_num, n); 
	    }  
	  
	    // If sum of powers is equal to x  
	    // then increase the value of result.  
	    if (p + curr_sum == x)  {
	    	results++;
	    	System.out.println("**FOUND**"+" Curr_num="+ curr_num+" power="+ p+ " curr_sum="+ curr_sum+"\n");
	    }
	        
	  
	    // Return the final result  
	    return results;  
	}  

}
