package com.dsa.Engineering_Animuthyam;

public class Maximum_Number_of_Words_Found_in_Sentences_2114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		
		int fin = mostWordsFound(sentences);
		
		System.out.println(fin);
		
	}
	 public static int mostWordsFound(String[] sentences) {
	        
		 int ans =0;
		 
		 
		 for(int i =0;i<sentences.length;i++) {
			 
			 String d = sentences[i];
			 
			 int temp =1;
			 
			 for(int j =0;j<d.length();j++) {
				 
				
				 if(d.charAt(j) == ' ') {
					 
					temp++;
					 
				 }
				 
			 }
			 ans = Math.max(ans,temp);
		 }
		 
		 return ans;
	    }

}
