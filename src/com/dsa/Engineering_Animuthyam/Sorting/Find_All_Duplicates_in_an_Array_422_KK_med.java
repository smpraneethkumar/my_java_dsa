package com.dsa.Engineering_Animuthyam.Sorting;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_an_Array_422_KK_med {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {4,3,2,7,8,2,3,1};
			
		sort(nums);
	}
	public static List<Integer> sort(int [] nums) {
		
		int  i =0;
		
		while(i<nums.length) {
			int cor = nums[i]-1;
			if(nums[i] != nums[cor]) {
				swap(nums,i,cor);
			}else {
				i++;
			}
		}
		
		List<Integer> ans = new ArrayList<>();
		
		for(int j =0;j<nums.length;j++) {
			if(nums[j] != j+1) {
				ans.add(nums[j]);
			}
		}
		return ans;
		
	}
	public static void swap(int [] nums,int first, int second) {
		
		int temp = nums[first];
		nums[first] = nums[second];
		nums[second] = temp;
	}

}