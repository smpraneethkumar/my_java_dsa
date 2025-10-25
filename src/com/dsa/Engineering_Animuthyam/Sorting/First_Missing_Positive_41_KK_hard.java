package com.dsa.Engineering_Animuthyam.Sorting;

public class First_Missing_Positive_41_KK_hard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		////////////////////////  AMAZON      //////////////////////
		
		int nums [] = {1,2,0};
		firstMissingPositive(nums);
	}
public static int firstMissingPositive(int[] nums) {
        
        int i =0;
        while(i<nums.length){

            int correct = nums[i] -1;
            if(nums[i] >0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for( int j =0;j<nums.length;j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return nums.length +1;
    }
    public static void  swap(int[] nums, int first, int second){

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
