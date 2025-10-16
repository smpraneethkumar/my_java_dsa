package com.dsa.test;

public class Bubble_Test {
	public static void main(String [] args) {
		
		int arr [] = {17,18,5,4,6,1};
		
		arr[0] = arr[1];
		arr[1] = arr[0];
		
		System.out.println(arr[0] + " "+ arr[1]);
	}

}
