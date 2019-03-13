package com.collections;

import java.util.Scanner;
import java.util.Stack;

public class Stacking {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
			Stack<Character> st = new Stack<Character>();
			
			char[] arr = input.toCharArray();
            
			for(int i=0; i< arr.length; i++) {
				
				if('{'==arr[i] || '('==arr[i] || '['==arr[i]) {
					st.push(arr[i]);
				}else if('}'==arr[i] && !st.isEmpty() && st.peek()=='{') {
					st.pop();
				}else if(')'==arr[i] && !st.isEmpty() && st.peek()=='(') {
					st.pop();
				}else if(']'==arr[i] && !st.isEmpty() && st.peek()=='[') {
					st.pop();
				}else {
					st.push(arr[i]);
				}
			}
			
			if(st.size()==0) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
			
			
		}
	}

}
