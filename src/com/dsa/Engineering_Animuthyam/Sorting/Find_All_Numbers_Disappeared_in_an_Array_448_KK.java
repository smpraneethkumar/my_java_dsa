package com.dsa.Engineering_Animuthyam.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array_448_KK {

	public static void main(String[] args) {
		
//		GOOGLE QUESTION
		
		
		// TODO Auto-generated method stub
		
		int nums [] = {4,3,2,7,8,2,3,1};
//		sort(nums);  
		System.out.println(sort(nums));

	}
	
	 static List<Integer> sort(int nums[]) {
		
		int i =0;
		
		while(i<nums.length) {
			
			int correct = nums[i] -1;
			
			if(nums[i] != nums[correct]) {
				swap(nums,i,correct);
			}
			else {
				i++;
			}
		}
		
		List<Integer> ans = new ArrayList<>();
	
		for(int j =0;j<nums.length;j++) {
			
			if(nums[j] != j+1) {
					ans.add(j+1);
			}
			
		}
		System.out.println(ans.get(0));
			System.out.println(ans.get(1));
		return ans;
	}
	
	 static void swap(int arr[], int first,int second) {
			
		 int temp = arr[first];
		 arr[first] = arr[second];
		 arr[second] = temp;
	}

}