package com.dsa.two_arrays;

public class Toeplitz_Matrix_766_EA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix[][]= {
				{1,2,3,4},
				{5,1,2,3},
				{4,5,1,2}
		};
		
		 
		int r = matrix.length;
		
		int c = matrix[0].length;
		
		System.out.println(c);
//		System.out.println(r);
//		
		for(int i =0;i<c;i++) {
 			System.out.println(matrix[i][c-1-i]);
		}
		
//		for(int i =0; i<matrix.length;i++) {
//			
//			
//			for(int j=0;j<matrix[i].length;j++) {
//				
//				System.out.println(i+" "+j);
//				
//			}
//			
//			
//		}

	}

}
