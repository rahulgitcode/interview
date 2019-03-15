package com.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

/*
 *https://www.hackerrank.com/challenges/java-dequeue/problem 
 */
public class Dequeing {
	
	static int max =0;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        Deque deque = new LinkedList<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
        
        int i;
        for(i=0; i<m; i++) {
        	int num = in.nextInt();
        	deque.addLast(num);
        }
        
        
        System.out.println(deque);
        max = findUniqueMax(deque, max);
        
        for(;i<n;i++) {
        	deque.removeFirst();
        	int num = in.nextInt();
        	deque.addLast(num);
        	
        	System.out.println(deque);
        	
        	max = findUniqueMax(deque, max);
        }
        
        System.out.println(max);
        
	}

	private static int findUniqueMax(Deque deque, int max) {
		Set<Integer> hs = new HashSet<Integer>();
		
		hs.addAll(deque);

		System.out.println("Set-"+hs);
		
		if(hs.size()>max)
			return hs.size();
		
		return max;
	}

}
