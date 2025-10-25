package com.dsa.test;

public class Smaple_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,3,4,5};
		
		int n = arr.length;
		
		for( int i =0;i<n;i++) {
			for(int j = i+1;j<=n;j++) {
				
				System.out.println(i+" "+j);
			}
		}

	}

}
