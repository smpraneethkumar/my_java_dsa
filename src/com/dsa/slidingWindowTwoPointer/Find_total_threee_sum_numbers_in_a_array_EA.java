package com.dsa.slidingWindowTwoPointer;

public class Find_total_threee_sum_numbers_in_a_array_EA {

	
	public static void main(String [] args) {
		
//		int arr [] = {5,7,1,8,9};
		int arr [] = {2,3,4,5,6};
		
//		int n = arr.length;
//		int sl = 3;
//		int ans = 0;
//		
//		
//		for(int i =0;i<n-sl+1;i++){
//			System.out.println(n-sl);
//			int j = i+sl-1;
//			
//			int temp =0;
//			for(int k =i;k<=j;k++) {
//					temp += arr[k];		
//			}
//			ans = Math.max(ans, temp);
//	}
//		System.out.println(ans);
		
		
		
//		BY USING SLIDING WINDOWS 
		
		int n = arr.length;
		int l = 0;
		int temp = 0;
		int ans = 0;
		int sl = 3;
		for(int r=0;r<n;r++) {
			temp += arr[r];
						
			if(r-l == sl) {
				temp-=arr[l];
				l++;
			}
			
			if(r-l+1 == sl) {
				ans = Math.max(ans, temp);
			}
		}
		System.out.println(ans);
		
	}

}
