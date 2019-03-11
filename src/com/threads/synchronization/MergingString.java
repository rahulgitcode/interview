package com.threads.synchronization;

public class MergingString {
	public static void main(String[] args){
		String s1="abc";
		String s2 = "cdefg";
		
		int l1 = s1.length();
		int l2 = s2.length();
		
		int max =0;
		
		if(l1>l2){
			max = l2;
		}else{
			max= l1;
		}
		
		StringBuffer res = new StringBuffer();
		for(int i=0; i<max; i++){
			res.append(s1.charAt(i)).append(s2.charAt(i));
		}
		
		if(l2>l1){
			res.append(s2.substring(max));
		}else{
			res.append(s1.substring(max));
		}
		
		System.out.println(res);
	}

}
