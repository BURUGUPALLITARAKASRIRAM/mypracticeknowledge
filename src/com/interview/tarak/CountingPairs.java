package com.interview.tarak;
public class CountingPairs {
	public static int countPairs(int []arr ,int n ,int k) {
		int result=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==k) {
					result++;
				}
			}                           
		}
		System.out.println("sum of the pairs is > " + result);
		return result;
	}
	public static void main(String[] args) {
		int[] arr = {1,5,7,-1,5};
		int n=arr.length;
		int k=6;
		countPairs(arr , n , k);
	}
}