package com.dsa.LeetCodeQuestions;

import java.util.HashMap;

public class Roman_to_Integer_13_me {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <Character ,Integer> has =new  HashMap<>();
		
		has.put('I', 1);
		has.put('X', 10);
		
		int ans = has.get('I') + has.get('X');
		
		System.out.println(ans);
		
		System.out.println(has.get('I'));
		
int[] nums = {10, 100, 1000, 1020, 3050};
        
        for (int i = 0; i < nums.length; i++) {
            String str = String.valueOf(nums[i]);   // convert number to string
            str = str.replace("0", "");             // remove zeros
            int result = Integer.parseInt(str);     // back to integer
            System.out.println(nums[i] + " → " + result);
        }

	}

}
