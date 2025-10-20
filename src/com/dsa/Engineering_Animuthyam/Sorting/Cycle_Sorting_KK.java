package com.dsa.Engineering_Animuthyam.Sorting;

import java.util.Arrays;

public class Cycle_Sorting_KK {
	
	public static void main (String [] args) {
			
		int arr[] = {3,0,1};
		
		cycleSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	 public static  void cycleSort(int arr[]) {
		
		int i =0;
		
		while(i<arr.length && i == arr[i]) {
			
			int corection = arr[i] -1;
			
			if(i != corection) {
				
				swap(arr, i,corection);
			}
			else{
				i++;
			}
			
		}
		
	
		
	
	}

	static void swap(int arr[],int first,int second ) {
		
		int temp = arr[first];
		
		 arr[first] = arr[second];
		 arr[second] = temp;
	}
}
