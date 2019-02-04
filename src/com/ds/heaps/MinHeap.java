package com.ds.heaps;

import java.util.Arrays;

public class MinHeap {
	int capacity = 10;
	int size = 0;
	int[] items = new int[capacity];
	
	private int getLeftChildIndex(int parentindex) {return 2*parentindex+1;};
	private int getRightChildIndex(int parentindex) {return 2*parentindex+2;};
	private int getParentIndex(int childIndex) {return (childIndex-1)/2;};
	
	private boolean hasLeftChild(int parentIndex) {
		return getLeftChildIndex(parentIndex) < size;
	}
	private boolean hasRightChild(int parentIndex) {
		return getRightChildIndex(parentIndex) < size;
	}
	private boolean hasParent(int parentIndex) {
		return getParentIndex(parentIndex) >= 0;
	}
	
	private int getLeftChild(int parentIndex) {return items[getLeftChildIndex(parentIndex)];};
	private int getRightChild(int parentIndex) {return items[getRightChildIndex(parentIndex)];};
	private int getParent(int childIndex) {return items[getParentIndex(childIndex)];};
	
	private void ensureExtraCapacity() {
		if(size==capacity) {
			Arrays.copyOf(items, capacity*2);
			capacity*= 2;
		}
	}
	
	private void swap(int index1, int index2) {
		int temp = items[index1];
		items[index1] = items[index2];
		items[index2] = temp;
	}
	
	public void add(int item) {
		ensureExtraCapacity();
		items[size] = item;
		size++;
		heapifyUp();
	}
	
	private void heapifyUp() {
		int index = size -1;
		while(hasParent(index)) {
			if(getParent(index) > items[index]) {
				swap(index,getParentIndex(index));
				index = getParentIndex(index);
			}else {
				break;
			}
		}
		
	}
	public int remove() {
		if(size==0) throw new IllegalStateException();
		
		int item = items[0]; // remove element at root
		items[0] = items[size-1];
		size--;
		heapifyDown();
		
		return item;
		
	}
	private void heapifyDown() {
		int index = 0;
		
		while(hasLeftChild(index)) {
			//find smallest of two children
			int smallestChildIndex = getLeftChildIndex(index);
			if(hasRightChild(index) && getRightChild(index)< getLeftChild(index)) {
				smallestChildIndex = getRightChild(index);
			}
			
			//swap the index with smallest of the two children
			if(items[index]>items[smallestChildIndex]) {
				swap(index,smallestChildIndex);
				index = smallestChildIndex;
			}else {
				break;
			}
		}
	}
}
