package com.dsa.day_4;

public class Print_primes {

	public static void main(String[] args) {
	
		
//		CHART GPT
		
		for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
		
//		int a =10;
//		
//		
//		{
//			a= 100;
//			System.out.println(a);
//		}
//		System.out.println(a);
	}

}
