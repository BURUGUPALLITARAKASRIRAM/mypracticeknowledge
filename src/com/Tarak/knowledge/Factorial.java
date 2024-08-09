package com.Tarak.knowledge;

import java.util.Scanner;

public class Factorial {
	public static void main(String [] args) {
		int fact =1;
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a number to calculate factorial:");
		int number = s.nextInt();
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
        System.out.println("Factorial of " + number + " is: " + fact);
	}

}
