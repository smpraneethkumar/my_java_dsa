package com.dsa.slidingWindowTwoPointer;

import java.util.Arrays;

public class _Minimum_Difference_Between_Highest_and_Lowest_of_K_Scores_1984 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,4,7,9};
		
		int k=3;
		int ans =Integer.MAX_VALUE;
		Arrays.sort(arr);
		int l=0;
		for(int r =0;r<arr.length;r++) {
			
			if(r-l==k) {
				l++;
			}
			
			if(r-l+1==k) {
				int temp = arr[r]- arr[l];
				
				ans = Math.min(ans,temp);
			}
		}
		System.out.println(ans);

	}

}
