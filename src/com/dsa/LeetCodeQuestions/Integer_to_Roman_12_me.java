package com.dsa.LeetCodeQuestions;

import java.util.HashMap;

public class Integer_to_Roman_12_me {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 3749;
		
		System.out.println(intToRoman(num));
		

	}
	
	 public  static String intToRoman(int num) {
	        
	        int val[]= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	        String symbol[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

	        StringBuilder roman = new StringBuilder();

	        for(int i =0;i<val.length;i++){

	            while(num >= val[i]){

	                num = num - val[i];
	                roman.append(symbol[i]);
	            }

	        }
	        return roman.toString();
	 }

}
