package com.dsa.test;

public class Patterns_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r =4;
		int c =20;
	
		
		for(int i =0;i<r;i++) {
			

			for(int j =0;j<c;j++) {
			
			
			if(i==0 || i ==r-1|| j==0|| j ==c-1) {
				System.out.print("*");
				
			}else {
				System.out.print(" ");
	
				}
		
	
			}
			
			System.out.println();
		} 
		
		
		for(int a =0;a<r;a++) {
			
			for(int b =0;b<r-a;b++) {
				
				
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}


