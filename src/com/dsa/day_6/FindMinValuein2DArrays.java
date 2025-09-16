package com.dsa.day_6;

public class FindMinValuein2DArrays {
	
	public static void main(String[] args) {
		
		int arr[][] = {
				{23,56,15},
				{45,25,45},
				{85,9,85}
				};
		
		System.out.println(min2d(arr));
	}
	
	static int min2d(int[][] array) {
		
		int ans = array[0][0];
		
		for(int r=0; r<array.length;r++) {
			
			for(int c=0;c<array[r].length;c++) {
				
				if(array[r][c] < ans) {
					ans = array[r][c];
				}
			}
		}
		return ans;
	}

}
