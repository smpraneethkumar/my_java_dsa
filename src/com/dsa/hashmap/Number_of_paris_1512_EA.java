package com.dsa.hashmap;

import java.util.HashMap;

public class Number_of_paris_1512_EA {

	public static void main(String[] args) {
		
		int nums [ ] = {11,2,3,11,11,3};
		
		int ans =0;
//		for(int i =0;i<nums.length;i++) {
//			for(int j =i+1;j<nums.length;j++) {
////				System.out.println(nums[i]+" "+nums[j]);
//				
//				if(nums[i] == nums[j] ){	
//					ans++;	
//				}
//			}
//			
//		System.out.println(ans);
//		}
		
		HashMap <Integer, Integer> has = new HashMap <>();
		
		for(int i =0;i<nums.length;i++) {
			
			int key = nums[i];
			
			if(has.containsKey(key)) {
				
				ans = ans + has.get(nums[i]);
				has.put(nums[i],has.get(nums[i])+1);
				
			}else {
				has.put(key, 1);
			}
		}
		System.out.println(ans);
	}
}
