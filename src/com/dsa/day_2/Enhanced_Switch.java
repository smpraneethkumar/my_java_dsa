package com.dsa.day_2;

import java.util.Scanner;

public class Enhanced_Switch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int option = input.nextInt();
		
		switch(option) {
		
		case 1 -> System.out.println("this is one");
		
		case 2 ->System.out.println("this is two");
		
		case 3 ->System.out.println("this is three");
		
		case 4 ->System.out.println("this is four");
		
		case 5 ->System.out.println("this is five");
		
			
		
//		case 1 :
//			System.out.println("this is one");
//		break;
//		case 2:
//			System.out.println("this is two");
//		break;
//		case 3 :
//			System.out.println("this is three");
//		break;
//		case 4 :
//			System.out.println("this is four");
//		break;
//		case 5 :
//			System.out.println("this is five");
//		break;
		}

	}

}
