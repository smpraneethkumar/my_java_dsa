package com.dsa.Engineering_Animuthyam;

public class Best_time_to_buy_and_Sell_stocks_121 {

	public static void main (String [] args) {
		
		int arr[] = {7,1,5,3,6,4};
		int n= arr.length; 
		int profit =0;
		int low = arr[0];
//		System.out.println(low);
//		for(int i=0;i<n;i++) {
//			
//			for(int j=i+1;j<n;j++) {
//				
////				System.out.println(arr[i]+" "+arr[j]);
//				
//				int temp = arr[j] - arr[i];
//				
//				if(temp  > profit) {
//					profit =temp;
//				}
//				
//			}
//		}
//		
//		System.out.println(profit);
//		
//		for(int i=1;i<n-1;i++) {
////			System.out.println(arr[i]);
//			if(profit < arr[i]-1) {
//				profit =arr[i];
//			}
//		}
//		System.out.println(profit);
		
		
		for(int i=1;i<n-1;i++) {
			int temp = arr[i] - low;
//			System.out.println(arr[i]);
//			System.out.println(temp+"kljhjk");
//			
			profit = Math.max(profit,temp);
			if(arr[i] < low) {
				low = arr[i];
//				System.out.println("low"+low);
			}
		}
		System.out.println(profit);
	}
}
