package com.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SortedSet {
	
	public static void main(String[] args) {
		Set<Integer> sortedset = new TreeSet<Integer>();
		int[] arr = {1, 23,50, 12, 9, 30, 2, 50};
		
		for(int x : arr) {
			sortedset.add(x);
		}
		
		Iterator itr = sortedset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
