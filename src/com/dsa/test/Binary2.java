package com.dsa.test;

public class Binary2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1,2, 3, 5, 9, 14, 16, 18};
	        int target = 1;
	        int ans = floor(arr, target);
	        System.out.println(ans);
	}
	 static int floor(int[] arr, int target) {
	        int start = 0;
	        int end = arr.length - 1;

	        while(start <= end) {
	            // find the middle element
//	            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
	            int mid = start + (end - start) / 2;

	            if (target < arr[mid]) {
	                end = mid - 1;
	            } else if (target > arr[mid]) {
	                start = mid + 1;
	            } else {
	                // ans found
	                return mid;
	            }
	        }
	        return end;
	    }

}
