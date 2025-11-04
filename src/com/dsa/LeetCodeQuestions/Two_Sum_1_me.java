package com.dsa.LeetCodeQuestions;

import java.util.Arrays;

public class Two_Sum_1_me {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Input: nums = [2,7,11,15], target = 9
//				Output: [0,1]
//
		int nums[] = {2,7,11,15};
		int target = 9;
		
		System.out.println(Arrays.toString(twoSum(nums,target)));

	}

	private static int[] twoSum(int[] nums, int target) {
		// TODO Auto-generated method stub
		
		int ans[] = new int[2];
		int n =nums.length;
		for(int i =0;i<n;i++) {
			
			for(int j =i+1;j<n;j++) {
				
				if(nums[i]+nums[j]==target) {
					
					ans[0]=i;
					ans[1]=j;
					break;
				}
			}
//			System.out.println(ans);
		}
		return ans;
		
	}

}
