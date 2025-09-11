package com.dsa.day_2;

import java.util.Scanner;

public class Loops_statements {

	public static void main(String[] args) {
		
//	1)	Area Of Circle Java Program	
		Scanner input =new Scanner(System.in);
//		double d = Math.PI;
//		
//		System.out.println(d);
//		
//		
//		double radius = input.nextDouble();
//		
//		double a = Math.PI * radius * radius;
//		
//		System.out.println("the radius is "+ a );
		
		
//	2)	Area Of Triangle
		
//		int tr = input.nextInt();
//		
//		int triangle = tr + tr + tr ;
//		
//		System.out.println("the length of the triangle "+ triangle);
		
		Scanner in = new Scanner(System.in);

        // Input base of the triangle
        System.out.print("Enter the base of the triangle: ");
        double base = in.nextDouble();

        // Input height of the triangle
        System.out.print("Enter the height of the triangle: ");
        double height = in.nextDouble();

        // Formula: Area = (base * height) / 2
        double area = (base * height) / 2;

        System.out.println("The area of the triangle is: " + area);

	}

}
