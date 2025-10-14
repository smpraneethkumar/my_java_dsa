package com.dsa.day_6;

public class Find_the_value_in_between_the_array {
	
	public static void main (String [] args) {
		
		
		
		int nums[] = {23,45,1,2,8,19,-3,16,11,20};
		
		int target = 20;
		
		System.out.println(linearSearch(nums,target));
		
		
		
		
	}

		static int linearSearch(int [] arr,int target) {
			
			if(arr.length == 0) {
				
				return -2;
			}
			
			
			for(int i = 0; i<arr.length;i++) {
				
				if(arr[i] == target) {
					
					return i;
				}
			}
			return -1;
		}
}
