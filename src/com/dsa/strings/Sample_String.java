package com.dsa.strings;

public class Sample_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("a" + 'a');
		
		String person1 = "praneeth";
		String person2 = "praneeth";
		String person3 = "praneeth";
		String person4 = person1;
		
		System.out.println(person1 == person3);
		
		System.out.println(person1);
		System.out.println(person4);
		
		person1 = "kunal";
//		person4 = person1;
		
		System.out.println(person1);
		System.out.println(person4);
		
		System.out.println(person1 == person4);
		
//		Strin
		
		System.out.println('a' +3+ 'b');
		
		float a = 433.1234f;
		System.out.printf("formatted number is %.1f" , a);

	}

}
