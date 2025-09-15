package com.dsa.day_5;

import java.util.Scanner;

public class TwoDArrays {

	public static void main(String[] args) {
		
		
//		int[][] arr4 = new int[3][3];	
//		arr4[1][0] = 23;
//		arr4[1][1] = 43;
//		arr4[1][2] = 79;
//		arr4[2][0] = 90;
//		arr4[2][1] = 60;
//		arr4[2][2] = 11;
//		arr4[0][0] = 87;
//		arr4[0][1] = 17;
//		arr4[0][2] = 88;
//		System.out.pri ntln(arr4[0][2]);
		
		
		
		
		
//		int[][] arr3 = {
//		                   {12,334,34},
//		                   {34,343,5},
//		                   {23,46,11}
//						};
				
		
		Scanner in = new Scanner(System.in);
		int[][] arr = new int[3][3];
		
		for(int r=0;r<arr.length;r++) {
			
			for(int c=0;c<arr[r].length;c++) {
				
				arr[r][c]=in.nextInt();
			}			
		}
		
for(int r=0;r<arr.length;r++) {
			
			for(int c=0;c<arr[r].length;c++) {
				
				System.out.print(arr[r][c]+ " ");
			}
			System.out.println();
			
		}

		
		
		in.close();
	}

}
