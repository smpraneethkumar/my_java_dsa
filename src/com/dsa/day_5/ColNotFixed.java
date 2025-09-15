package com.dsa.day_5;

public class ColNotFixed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {
				{1,5,3},
				{45,76,},
				{23,56,98,3}
		};
		
		for(int row =0; row<arr.length;row++) {
			
			for(int col=0; col<arr[row].length;col++) {
				
				System.out.println(arr[row][col]+ "");
			}
			System.out.println();
		}

	}

}
