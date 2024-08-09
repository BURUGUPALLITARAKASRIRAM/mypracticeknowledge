package com.interview.tarak;
import java.util.Arrays;
public class RotateArray {
	public static int rotatingArray(int arr[], int n) {
		int k=0;
		int d=4;
		int newArray [] =new int[n];
		for(int i=d;i<n;i++) {
		newArray[k++]=arr[i];
		}
		for(int i=0;i<d;i++) {
			newArray[k++]=arr[i];
		}
		System.out.println(Arrays.toString(newArray));
		return n;		
	}
	public static void main (String [] args) {
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		rotatingArray(arr, n);
	}
}
