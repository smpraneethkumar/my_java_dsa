package com.dsa.Engineering_Animuthyam.Sorting;

import java.util.Arrays;

public class Set_Mismatch_645_KK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] nums = {1,2,2,4};
			sort(nums);
			System.out.println(Arrays.toString(nums));
			
	
	}
	
	public static int[] sort(int [] nums) {
		
		 int i =0;
         while(i<nums.length){
                 int cor = nums[i] -1;
                 if(nums[i] != nums[cor] ){
                     swap(nums,i,cor);
                 }else{
                     i++;
                 }
         }
         for(int j =0;j<nums.length;j++){

                  if(nums[j] != j+1 ){
                      return new int[] {nums[j], j+1};
              }
                
         }
        

        return new int [] {-1, -1}; 

	}
	public static void swap(int [] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
   }

}
