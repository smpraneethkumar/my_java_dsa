package com.dsa.hashset;

import java.util.HashSet;

public class Set_mismatch_645_EA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {1,2,2,3};
		
		HashSet <Integer> hs = new HashSet <>();
		
		int duplicate = 0;
		
		for(int i =0;i<nums.length;i++) {
			
			int val = nums[i];
			
			 if(!hs.contains(val)) {
				 hs.add(val);
			 }
			 else {
				 duplicate = val;
			 }
		}
		int missing = 0;
		int n = nums.length;
		
		for(int j =0;j<=n;j++) {
			
			if(!hs.contains(j)) {
				
				missing = j;
			}
		}
		System.out.println(duplicate +" "+ missing);

	}

}
