package com.dsa.slidingWindowTwoPointer;

public class Find_total_three_sum_letters_in_a_string_EA {
	
	public static void main (String [] args) {
		
		String s = "animuthyam";
		
//		char c = s.charAt(1);
//		
//		int as = c;
//		System.out.println(as);
		
		int n =s.length();
		int sl =3;
		int ans =0;
		
		for(int i =0;i<n-sl+1;i++) {
			 int j = i+sl-1;
			int temp = 0;
			
			for(int k = i;k<=j;k++) {
				char c = s.charAt(k);
				
				int as = c;
				
				temp += as;
				
			}
			ans = Math.max(ans, temp);
		}
		System.out.println(ans);
		
	}

}
