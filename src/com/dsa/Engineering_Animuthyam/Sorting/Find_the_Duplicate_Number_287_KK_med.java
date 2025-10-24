package com.dsa.Engineering_Animuthyam.Sorting;

import java.util.Arrays;

public class Find_the_Duplicate_Number_287_KK_med {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// ////////////////	AMAZON QUESTION   /////////////////
			
		int nums[] = {1,3,4,2,2};
		
		System.out.println("sdgsddddsg");
		sort(nums);
		
		System.out.println(Arrays.toString(nums));
	}

	private static int sort(int[] nums) {
		// TODO Auto-generated method stub
		
		int i =0;
		while(i<nums.length) {
			
			if( nums[i] != i+1) {
				
				int cor = nums[i]-1;
				if(nums[i] != nums[cor]) {
					swap(nums,i,cor);
				}
				else {
					return nums[i];
				}
				
			}else {
				i++;
			}
			
			
		}
			return -1;
				}

	private static void swap(int[] nums, int first, int second) {
		// TODO Auto-generated method stub
		
		int temp = nums[first];
		nums[first] = nums[second];
		nums[second] = temp;
		
	}

}
