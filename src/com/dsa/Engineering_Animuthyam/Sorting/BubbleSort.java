package com.dsa.Engineering_Animuthyam.Sorting;



public class BubbleSort {
	
	public static  void main (String [] agrs) {
		
		int arr [] = {17,18,5,4,6,1};
		System.out.println("17,18,5,4,6,1");
		System.out.println();
		
		for(int i =0;i<arr.length-1;i++) {
			
			for(int j =0;j<arr.length-i-1;j++) {
				
//				System.out.println(arr[j]+"dffdf");
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
//					System.out.println(temp);
					arr[j] = arr[j+1];
								System.out.println(arr[j+1] = temp);
//					System.out.println(arr[j]);
				}
			}
		}
		
		for(int h =0;h<arr.length;h++) {
			System.out.print(arr[h]+" ");
		}
	}

}
