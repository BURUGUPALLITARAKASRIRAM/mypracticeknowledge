package com.sorting.programs;
public class LinearSearch {
	public static int linearSearch(int []arr,int key) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==key) {
			return i;
		}
	}
	return -1;
	}
	public static void main(String[] args) {
        int[] arr = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        int key =110;
        System.out.println(linearSearch(arr,key));

	}
}