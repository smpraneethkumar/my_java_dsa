package com.dsa.Engineering_Animuthyam;

public class Reversing_string_Palindrome {
	
	public static void main(String[] args) {
		
//		String word = "hooy";
//		
//		String ans ="";
//		for(int i = word.length()-1; i>=0;i--) {
//		
//		 ans = ans + word.charAt(i);
/////			charAt(i);
//		}
//		
//		if(ans.equals(word)) {
//			System.out.println(ans+" - it is a palindrome");
//		}else{
//			System.out.println("it is NOT a palindrome");
//		}
//		
//		System.out.println(ans);
		
		
		
//		advanced palindrome it take's less time to run the code
		
//		String word  = "sdf";
//		
//		boolean palindrome = true;
//		
//		int len = word.length();
//		
//		for(int i = 0;i<len/2;i++) {
//			
//			if(word.charAt(i)!= word.charAt(len-i-1)) {
//				palindrome = false;
//			}
//		}
//		
//		if(palindrome) {
//			System.out.println("YES");
//		}else{
//			System.out.println("NO");
//		}
		
		
		int num = 89;
        String binary = "";

        while (num > 0) {
            int remainder = num % 2;       // get remainder
            binary = remainder + binary;   // append in reverse
            num = num / 2;                 // divide by 2
        }

        System.out.println("Binary = " + binary);
		
	}
	

}
