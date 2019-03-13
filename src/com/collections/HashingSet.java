package com.collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*
 * https://www.hackerrank.com/challenges/java-hashset/problem
 */
public class HashingSet {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        //Write your code here
        Set<String> hs1 = new HashSet<String>();
        Set<String> hs2 = new HashSet<String>();
        for(int i=0; i<pair_left.length; i++){
            if(hs1.contains(pair_left[i])) {
            	
            }
        	hs1.add(pair_left[i]);
            hs2.add(pair_right[i]);
            System.out.println(hs1.size()>=hs2.size()? hs1.size() : hs2.size());
        }

	}

}
