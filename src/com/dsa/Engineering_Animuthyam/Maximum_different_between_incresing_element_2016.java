package com.dsa.Engineering_Animuthyam;

public class Maximum_different_between_incresing_element_2016 {
		
	public static void main (String [] args) {
		
		int nums [] = {7,1,5,4};
		
		int  n = nums.length;
		int max = -1;
		
		
//		--------------0NE WAY----------
//		for(int i=0;i<n-1;i++) {
//			
//			for(int j=i+1;j<n;j++) {
//				int a =nums[i];
//				int b =nums[j];
//				
//				if(a<b) {
//					int temp = b-a;
//					
//					max = Math.max(max,temp);
//				}
//			}
//		}
//		System.out.println(max);
		
		
//		----------------ANOTHER WAY----------------
		int leftmin =nums[0];
		for(int i=0;i<n;i++) {
			int val = nums[i];
			
			if(leftmin<val) {
				
				max = Math.max(max, val-leftmin);
			}
			leftmin = Math.min(leftmin, val);
		}
		System.out.println(max);
	}
	
}
