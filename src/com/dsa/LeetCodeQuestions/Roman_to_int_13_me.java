package com.dsa.LeetCodeQuestions;

import java.util.HashMap;

public class Roman_to_int_13_me {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String s = "LVIII";
	       System.out.println( romanToInt(s));

	}
	public static int romanToInt(String s) {

        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        System.out.println(hm.get('M'));
               int result  = hm.get(s.charAt(s.length()-1));

        for(int i =s.length()-2;i>=0;i--){
            System.out.println(i);

            if(hm.get(s.charAt(i))<hm.get(s.charAt(i+1))){
                result = result-hm.get(s.charAt(i));
            }
            else{
                result = result+hm.get(s.charAt(i));
            }

        }
        return result;

    }

}
