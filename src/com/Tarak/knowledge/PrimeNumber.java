package com.Tarak.knowledge;
import java.util.Scanner;
public class PrimeNumber {
	public static boolean isPrime(int num) {
     if(num<=1) {
    	 return false;
     }
     for(int i=2;i<num;i++) {
    	 if(num%2==0) {
    		 return false;
    	 }
     }
		return true;
	}
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = s.nextInt();
		s.close();
		if(isPrime(number)) {
			System.out.println("is prime number");
		}else {
			System.out.println("is not Prime number");
		}
	}
}
