package com.sorting.programs;
public class BinarySearch {
	public static int binarySearch(int arr[],int key) {
		int low=0,high=arr.length-1,mid=0;
		while(low<high) {
			mid=(low+high)/2;
			if(key==arr[mid]) {
				return mid;
			}else if(key<arr[mid]) {
				high=mid-1;
				low=low;
			}else {
				low=mid+1;
				high=high;
			}
		}
		return -1;
	}
	public static void main(String [] args) {
		int arr[] = { 2, 3, 4, 10, 40 ,42,63};
		int key =10;
		System.out.println(binarySearch(arr, key));
	}
}
