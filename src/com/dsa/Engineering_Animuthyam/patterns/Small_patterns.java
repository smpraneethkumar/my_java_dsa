package com.dsa.Engineering_Animuthyam.patterns;

public class Small_patterns {
	
	public static void main (String [] args) {
		
		int n =5;
//		1.pattern
		
		for(int i =0; i<5; i++) {
			
		for(int j =0;j<5;j++) {
			
			System.out.print("*");
		}
			
		System.out.println();
		}
		
//		2.pattern
		
		for(int i =0; i<n;i++) {
			
			for(int j =0;j<n;j++) {
				
				System.out.print("*");
				
				if(j!=n-1) {
					System.out.print("-");
				}
			}
			System.out.println();
		}
		
	}

}
