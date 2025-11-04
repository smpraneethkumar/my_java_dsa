package com.dsa.slidingWindowTwoPointer;

import java.util.Arrays;

public class Array_Partition_561 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {1,4,3,2};
		
		Arrays.sort(nums);
		int ans =0; 
		for(int i =0;i<nums.length;i=i+2) {
			ans += nums[i];
		}
		System.out.println(ans);

	}

}
