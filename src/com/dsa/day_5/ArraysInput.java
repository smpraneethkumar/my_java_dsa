package com.dsa.day_5;

import java.util.Scanner;

public class ArraysInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr2 = new int[3];
		
		arr2[0]= 23;
		arr2[2]= 33;
		arr2[1]= 63;
		System.out.println(arr2[0]);
		System.out.println(arr2[2]);
		
		arr2[0]=99;
		System.out.println(arr2[0]);
		
		
		
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i = 0; i<arr.length; i++) {
			
			arr[i] = in.nextInt();
		}
		
		for(int j = 0;j<arr.length; j++) {
		
		System.out.print(arr[j]+" ");
		}
		

	}

}
