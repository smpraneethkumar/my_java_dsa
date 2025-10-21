package com.dsa.hashmap;

import java.util.HashMap;

public class Decode_the_message_2325_EA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <Character, Character> has = new HashMap <>();
		String key = "the quick brown fox jumps over the lazy dog";
		String message = "vkbs bs t suepuv";
		
		
//		for(int i =0;i<26;i++) {
//			
//			int  n = 'a'+i;
//			System.out.println(n);
//			
//			if( 'b' == n) {
//				System.out.println("yes");
//			}
//			
//		}
		
		
		int alp = 97;
		for(int i =0;i<key.length();i++) {
			
			char letter = key.charAt(i);
			
			if(letter!=' ' && !has.containsKey(letter)) {
				
				has.put(letter, (char)alp);
			}
			alp++;
			
		}
		String ans = "";
		for(int h =0;h<message.length();h++) {
			
			char ch = message.charAt(h);
			
			if(ch!= ' ') {
				char val = has.get(ch);
				
				ans += val;
			}
			else {
				ans += ' '; 
			}
			
		}
		System.out.println(ans);
		
		
	}

}
