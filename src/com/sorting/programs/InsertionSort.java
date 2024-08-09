package com.sorting.programs;
import java.util.Arrays;
public class InsertionSort {
	public static void insertionSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int key =arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		
	}
	public static void main(String [] args) {
		int arr[] = {4,7,3,2,5};
		System.out.println("Unsorted array"+ Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("Sorted array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
