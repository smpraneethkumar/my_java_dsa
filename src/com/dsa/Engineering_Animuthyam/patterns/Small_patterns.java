package com.dsa.Engineering_Animuthyam.patterns;

public class Small_patterns {
	
	public static void main (String [] args) {
		
		int n =5;
//		1.pattern
		
		for(int i =0; i<5; i++) {
			
		for(int j =0;j<5;j++) {
			
			System.out.print(i);
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
			
//		3.pattern
		int r3 =3;
		int c3 =20;
		
		for(int i =0; i<r3;i++) {
			
			for(int j =0;j<c3;j++) {
				System.out.print("*");
				
				if(j!=c3-1) {
					System.out.print("-");
				}
			}
			System.out.println();
		}
		
//		4.pattern
		int r4 =10;
		int c4 =3;
		
		for(int i =0;i<r4;i++) {
			
			for(int j =0;j<c4;j++) {
				
				System.out.print("*");
				
				if(j!=c4-1) {
					System.out.print("-");
				}
			}
			
			System.out.println();
		}
		
//		5.pattern
		int r5 =5;
		int c5 =5;
		
		for(int i =0;i<r5;i++) {
			
			for(int j=0;j<c5;j++) {
				
				if(i==0 || i==r5-1|| j==0 || j==c5-1) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

//		6.pattern
		int r6=9;
		int c6=7;
		
		for(int i =0;i<r6;i++) {
			for(int j=0;j<c6;j++) {
				
				
				
				if(i==0|| j==0||i==4||j==6||i==r6-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
//		7-pattern
//		int r7 =6;
		int c7 =5;
//		
//		for(int i=0;i<r7;i++) {
//			
//			for(int j=0; j<c7-1;j++) {
//				System.out.print(" ");
//				
//				for(int k =0;j<c7;k++) {
//				System.out.print("*");	
//				}
//			}
//			
//			System.out.println();
//		}
		
//		

		for(int i=0;i<c7;i++) {
			
			
				for(int j=0;j<c7-i;j++) {
					System.out.print("*");
				}
				for(int k=0;k<c7;k++) {
					System.out.print("/");
				}
				System.out.println();
			
				
			}
//		8.pattern
		
		int n8 = 5;
		int j8 =4;
		for(int i =0;i<n8;i++) {
			
			
				for(int j=0;j<j8-i;j++) {
					System.out.print("*");
				}
				for(int k =0;k<j8+i;k++) {
					System.out.print("-");
				}
			
			System.out.println();
		}
			
			
			
		
		
		
		
		
		
		
		
	}

}
