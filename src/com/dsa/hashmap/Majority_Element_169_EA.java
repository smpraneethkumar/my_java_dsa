package com.dsa.hashmap;

import java.util.HashMap;

public class Majority_Element_169_EA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int nums[] = {3,2,3};
		
		int i = nums.length/2;
//		System.out.println(i);
//		System.out.println(me(nums));
		System.out.println(leet(nums));
	}
	
//	THIS IS DID BY ME  AND FILED IN THE TESTCASES IN LEETCODE
	static  int me(int [] nums) {
		
		HashMap <Integer,Integer> has =new  HashMap<>();
		int ans =0;
		for(int i =0;i<nums.length;i++) {
			
			int val = nums[i];
			
			if(has.containsKey(val)) {
			return ans =val;
			}else {
				has.put(val, 1);
			}
		}
		
		return ans ;
	}
	
	static int leet(int[] nums) {
		
		HashMap <Integer, Integer> lee = new HashMap <>();
		
		for(int i =0;i<nums.length;i++) {
			int key = nums[i];
			lee.put(key, lee.getOrDefault(key,0)+1);
		}
		
		int ans = 0;
		int n = nums.length/2;
		
		for(int j:lee.keySet()) {
			int val = lee.get(j);
			
			if(val>n) {
				ans = j;
			}
		}
		return ans;
	}
	

}
