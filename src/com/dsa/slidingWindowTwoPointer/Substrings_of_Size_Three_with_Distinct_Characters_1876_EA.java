package com.dsa.slidingWindowTwoPointer;

import java.util.HashMap;
import java.util.HashSet;

public class Substrings_of_Size_Three_with_Distinct_Characters_1876_EA {

	public static void main(String[] args) {

//		 =======================================BRUTE FORCE APPROACH
//		String s = "xyzzaz";
//		int n  = s.length();
//		int k =3;
//		int ans =0;
//		for(int i =0;i<n-k+1;i++) {
//			
//			boolean  temp =fun(s.substring(i,i+k),k); 
//		if(temp) {
//			ans+=1;
//		}
//		}
//		System.out.println(ans);
//		
//	}
//
//	static boolean fun(String s, int k) {
//		
//		HashSet <Character> hs = new HashSet <>();
//		
//		int n = s.length();
//		
//		for(int i =0;i<n;i++) {
//			
//			hs.add(s.charAt(i));
//		}
//		if(hs.size() ==3) {
//			return true;
//		}else {
//			return false;
//		}
//		
//		
//		
		
		
	
//		=====================================================OPTIMIZED APPROACH
		String s = "xyzzaz";
		
		System.out.println(optimized(s));
		
		
	}
	static int optimized(String s) {
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		int n = s.length();
		int ans =0;
		int l =0;
		int k =3;
		
		for(int r=0;r<n;r++) {
			char c = s.charAt(r);
			
			hm.put(c, hm.getOrDefault(c,0)+1);
			
			if(r-l==k) {
				char torem = s.charAt(l);
				hm.put(torem, hm.get(torem)-1);
				
				if(hm.get(torem)==0) {
					hm.remove(torem);
				}
				l++;
			}
			if(hm.size()==k) {
				ans+=1;
			}
		
		}
		
		return ans;
	}
	
	
}
