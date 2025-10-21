package com.dsa.hashmap;

import java.util.HashMap;

public class HashMape_EA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <String,Integer> has =new  HashMap<>();
		
		String arr[] = {"praneeth","ankit","praneeth","harsha","harsha"};
		
		for(int i =0;i<arr.length;i++) {
			
			String n = arr[i];
			
			if(has.containsKey(n)) {
				int per= has.get(n);
				has.put(n, per+1);
			}else {
				has.put(n, 1);
			}
			
//			System.out.println(has.get(n));
		}
		
		for(String Boom:has.keySet()) {
			System.out.println(Boom+" " +has.get(Boom));
		}
		
		
		
//		has.put(3, 4);
//		
//		int per = has.get(3);
//		System.out.println(per);
//		
//		has.put(3, per+2);
//		
//		System.out.println(has.get(3));

	}

}
