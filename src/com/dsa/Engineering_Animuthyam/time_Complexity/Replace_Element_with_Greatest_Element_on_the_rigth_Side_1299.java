package com.dsa.Engineering_Animuthyam.time_Complexity;

public class Replace_Element_with_Greatest_Element_on_the_rigth_Side_1299 {
	
	public static void main(String [] args) {
		 int arr [] = {17,18,5,4,6,1};
		 
		 int n = arr.length;
		 
//		 ---------------------ONE WAY-------------------
		 
//		 for(int i =0;i<n;i++) {
//			 
//			 int rightMax = -1;
//			 
//			 for(int j=i+1;j<n;j++) {
//				 
//				 rightMax = Math.max(rightMax, arr[j]);
//			 }
//			 arr[i] = rightMax;
//		 }
		 
//		 -------------------- ANOTHER WAY ---------- (ONECE CHEAK THE VIODE path-12)
		 
		 int rightMax = -1;
		 
		 for(int i =n-1;i>=0;i--) {
			 
			 int perv = arr[i];
			 
			 arr[i] = rightMax;
			 
			 rightMax = Math.max(rightMax, perv);
		 }
		 System.out.println(rightMax);
			 
		 
	}

}
