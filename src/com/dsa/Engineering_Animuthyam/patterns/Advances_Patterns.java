package com.dsa.Engineering_Animuthyam.patterns;

public class Advances_Patterns {
	
	public static void main (String [] args) {
		
		
		int c1 =5;
		
//		1.pattern
		for(int i=0;i<c1;i++) {
			
			for(int j =0; j<c1-i-1;j++) {
				
				System.out.print(" ");
			}
			for(int k=0;k<i*2+1;k++) {
				System.out.print("*");
			}

			
			System.out.println();
		}
		System.out.println("second pattern");
//		2.pattern
		int c2 =4;
		for(int i=c2-1;i>0;i--) {
			
			for(int j=0;j<c2-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i*2+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("third pattern");
//		3.pattern\
	}
		
}
