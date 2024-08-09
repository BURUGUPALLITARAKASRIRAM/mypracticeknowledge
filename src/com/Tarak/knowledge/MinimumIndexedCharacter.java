package com.Tarak.knowledge;
import java.util.HashMap;
public class MinimumIndexedCharacter {
	public static int minimumIndexedCharacter(String str1,String str2) { 
	 HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	 for(int i=0;i<str2.length();i++){
		 char ch1 = str2.charAt(i);
		 map.put(ch1, 1);
	 }
	 for(int j=0;j<str1.length();j++){
		 char ch2 = str1.charAt(j);
		 if(map.containsKey(ch2))
			 return j; 
	 }
		return -1;
	}
	////////////////////////****|****////////////////////////////
	public static int minimumIndexedCharacter1() {
		String s1 ="Tarak";
		String s2 ="teat";
		for(int i=0;i<s1.length();i++) {
			char ch1=s1.charAt(i);
			for(int j=0;j<s2.length();j++) {
				char ch2 = s2.charAt(j);
				if(ch1==ch2)
					return i;
			}
		}
		return 0;
	}
	public static void main(String [] args) {
		String str1="geeksforgeeks";
		String str2="set";
		System.out.println( minimumIndexedCharacter(str1, str2));
		System.out.println(minimumIndexedCharacter1());
	}
}
