package com.dsa.Engineering_Animuthyam.time_Complexity;

public class Two_Furthest_Houses_With_Different_Colors_2078 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int colours[] = {1,1,1,6,1,1,1};
		
		int n = colours.length;
		int max =0;
//		------------------ONE WAY ---------------
//		for(int i =0;i<n-1;i++) {
//			
//			for(int j=i+1;j<n;j++) {
//				
//				if(colours[i]!= colours[j]) {
//					
//					int diff = j-i;
//					
//					max = Math.max(max, diff);
//				}
//			}
//		}
//		System.out.println(max);
		
//		----------------ANOTHER WAY-----------------------
		for(int i =0;i<n;i++) {
			
			if(colours[i]!= colours[n-1]) {
				max = Math.max(max, n-1-i);
			}
		}
		for(int i =n-1;i>=1;i--) {
			if(colours[0]!=colours[i]) {
				max = Math.max(max, i);
			}
		}
		System.out.println(max);
	}

}
