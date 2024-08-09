package com.interview.tarak;
public class OccuranceInArray {
	public static int occurance(int arr[],  int k) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				count ++;
			}
		}
		return count;
	}
	public static void main(String [] args) {
		int arr[] = {1,1,2,2,2,2,3,3};
		int k=3;
		int result = occurance(arr, k);
        System.out.println("The number " + k + " occurs " + result + " times.");
	}
}