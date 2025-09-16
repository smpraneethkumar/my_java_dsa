package com.dsa.LeetCodeQuestions;

public class Find_Numbers_with_Even_Number_of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {12,345,2,6,7896};

	}
	
	static int findNumber(int arr) {
		int court = 0;
		
		for(int i = 0; i<arr;i++) {
			
			if(even(arr)) {
				
				court++;
				
				
			}
		}
	
		return court;
	}
	static boolean even(int arr) {
		int numberOfDigits = digits(arr);
		
		return numberOfDigits % 2 == 0;
		
	}
	
	static int digits(int arr) {
		
		if(arr< 0) {
			arr = arr * -1;
		}
		
		if(arr == 0) {
			return 1;
		}
		
		int court = 0;
		while(arr < 0) {
			
			court++;
		arr = arr/ 10;	
		}
		
		return court;
	}
}
