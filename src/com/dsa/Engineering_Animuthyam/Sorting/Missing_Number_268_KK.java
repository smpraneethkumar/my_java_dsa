package com.dsa.Engineering_Animuthyam.Sorting;

import java.util.Arrays;



//Amazon Question




public class Missing_Number_268_KK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {3,0,1};
		
		
		
		System.out.println(sort(arr));

	}
	
	 static int sort(int arr[]) {
		
 		int i = 0;
		
		int ans = 0;
		
		while(i<arr.length) {
			
			int cor = arr[i];
			
			if(arr[i]<arr.length && arr[i] != arr[cor]) {
				
				swap(arr,i,cor);
			}
			else {
				i++;
			}
		}
		
		for(int j =0 ;j<arr.length;j++) {
			
			if(arr[j] != j) {
				
				ans =  j;
			}
		}
		
		return ans;
//		return arr.length;
	}
	
	 static void swap(int arr[], int first,int second) {
		
		 int temp = arr[first];
		 arr[first] = arr[second];
		 arr[second] = temp;
	}

}
