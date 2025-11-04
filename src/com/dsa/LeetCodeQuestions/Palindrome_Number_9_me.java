package com.dsa.LeetCodeQuestions;

public class Palindrome_Number_9_me {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x= 1321;
		boolean  ans = true;
		String str = Integer.toString(x);
		
		int n = str.length();
		
		for(int i=0;i<n;i++) {
			
			 char ch1  =str.charAt(i);
//			 System.out.println(ch);
			 char ch2 = str.charAt(n-i-1);
			 if(ch1!=ch2) {
				 
				 ans = false;
//				 System.out.println("yes");
			 }
		}
		System.out.println(ans);

	}

}
