package com.dsa.day_6;

public class FindValuein2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {
				
				{12,53,8},
				{65,33,48},
				{27,46,58}
		};
		
		int traget = 8;
		
		int asw = SearchValuesInDArrays(arr,traget);

		System.out.println(asw);
	}
	
	static int SearchValuesInDArrays( int[][] arr, int traget) {
		
		if(arr.length == 0) {
			return -1;
		}
		
		for(int r= 0;r<arr.length;r++) {
			
			
			for(int c =0;c<arr[r].length;c++) {
				 
				int col = arr[r][c];
				
				if(col == traget) {
					return c;
				}
				
			}
		}
		
		return -1;
	}

}
