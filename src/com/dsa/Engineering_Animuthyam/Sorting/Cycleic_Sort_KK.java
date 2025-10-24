package com.dsa.Engineering_Animuthyam.Sorting;

import java.util.Arrays;

public class Cycleic_Sort_KK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {3,5,2,1,4};
	
		
		sort(arr);
		
		System.out.println(Arrays.toString(arr));

	}

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		
		int i =0;
		
		
		while(i<arr.length) {
			int correct = arr[i]-1;
			
			if(arr[i] != arr[correct]) {
				swap(arr,i,correct);
			}
			else{
				i++;
			}
		}
		
		
		
		
	}



	private static void swap(int[] arr, int first, int second){
		
		
		int temp = arr[first];
		
		arr[first] = arr[second];
		arr[second] = temp;
		
	}
}
