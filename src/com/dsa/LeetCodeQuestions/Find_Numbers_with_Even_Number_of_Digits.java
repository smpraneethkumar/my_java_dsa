package com.dsa.LeetCodeQuestions;

public class Find_Numbers_with_Even_Number_of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {12,345,2,6,7896,7809};
		
		System.out.println(findNumber(arr));
		
//		System.out.println(digits(-546379));

	}
	
	static int findNumber(int[] arr) {
		int court = 0;
		
		for(int i :arr) {
			
			if(even(i)) {
				
				court++;
				
				
			}
		}
		System.out.println("fddfjkfkj"+court);
	
		return court;
	}
//	function to check whether a number contain even digits   or not
	static boolean even(int i) {
		int numberOfDigits = digits(i);
		
		if(numberOfDigits % 2 == 0) { //this is a log cut if loop
			
			return true;
		}
		
		return false;
//		return numberOfDigits % 2 == 0; shortcut
		
	}
	
	static int digits(int i) {
		
//		if(i< 0) {
//			i = i * -1;
//		}
//		
//		if(i == 0) {
//			return 1;
//		}
		
		int court = 0;
		while(i > 0) {
			
			court++;
		i = i/ 10;	
		}
		
		System.out.println("digits sdklj"+court);
		
		return court;
	}
}
