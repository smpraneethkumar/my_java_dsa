package com.dsa.day_6;

public class FindValueinArrays {

	public static void main(String[] args) {
		
		
		int[] arr = {2,45,86,90,43,12,4,90};
		
		int target = 90;
		
		
		int ars = SearchValue(arr, target);
		
		System.out.println(ars);
	}
	
	static int SearchValue(int[]arr,int target) {
		
		if(arr.length == 0) {
			return -1;
		}
		
		for(int i = 0;i<arr.length;i++) {
			
			int element = arr[i];
			
			if(element == target) {
				
				return i;
			}
		}
		return -1;
	}     

}
