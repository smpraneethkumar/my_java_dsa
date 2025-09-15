package com.dsa.day_6;

public class FindMinValueinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-1,34,67,33,76,3,8,0};
		
		
System.out.println(min(arr));
	}
	
	static int min(int[] arr) {
		
		int aws = arr[0];
		
		for(int i = 0 ;i<arr.length;i++) {
			
			if(arr[i] < aws) {
				aws = arr[i];
			}
		}
		return aws;
		
	}

}
