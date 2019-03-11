package com.threads.synchronization;

import java.util.ArrayList;
import java.util.List;

public class LowerUpper {
	int[] result = new int[10];
	public static void main(String[] args) {
		
		int[] scores = {4,8,7};
		int[] lowerlimits = {2,4};
		int[] upperlimits = {8,4};
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<lowerlimits.length; i++){
			int lower = lowerlimits[i];
			int upper = upperlimits[i];
			
			int count=0;
			for(int j=0;j<scores.length; j++){
                if((scores[j]>lower && scores[j]<upper) || (scores[j]==lower || scores[j]==upper)){
                    count++;
                }
            }
			list.add(count);
		}
		
		int size = list.size();
        int[] result = new int[size];

        for(int i=0; i< result.length; i++){
            result[i] = list.get(i).intValue();
        }
        

	}

	

}
