package com.dsa.day_9;

public class BinarySearchInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] num = {12,17,20,23,29,33,35,40,52,55};
		
		int check = 12;
		
		 int ans =binarySearch(num,check);
		 
		 System.out.println(ans);
	}

	static int binarySearch(int[] arr, int check) {
		
		int start = 0;
		int end = arr.length;
		
		while(start <= end) {
			
			int mid = start + (end-start) /2;
			
			if(check <arr[mid]) {
				
				end = mid -1;
				
			}
			else if (check > arr[mid]) {
				
				start = mid +1;
			}
			else {
				
				return mid;
			}
		}
		
		return -1;
		
	}
}
