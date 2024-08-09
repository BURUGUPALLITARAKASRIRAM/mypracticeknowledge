package com.Tarak.knowledge;
public class FactorialUsingRec {
	public static int factorial(int n) {
		if(n<=1) {
			return n;
		}else
			return n*factorial(n-1);
	}
	public static void main(String[] args) {
		int n =5;
		int factValue=factorial(n);
		System.out.println(n +" is " + factValue);
	}
}