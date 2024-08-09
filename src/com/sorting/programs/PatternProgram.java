package com.sorting.programs;
public class PatternProgram {
	public static void main(String [] args) {
		 pattern();
	}
	public static void pattern() {
		int height=6;
		for(int i=1;i<height;i++) {
			for(int j=height-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}	
	}
}
