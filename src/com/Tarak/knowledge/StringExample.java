package com.Tarak.knowledge;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Tarak";
		char[] ch =s.toCharArray();
		 for(int i=0;i<s.length();i++){	 
			 System.out.print(s.charAt(i)+" "); 
		 }
		 System.out.println();
		for (int i=0;i<s.length()-2;i++) {
			char temp = ch[i];
			ch[i] =ch[i+2];
			ch[i+2] =temp;
		}
		 System.out.println("String after swaping :"+  Arrays.toString(ch));
		 
		 
		 
	}

}
