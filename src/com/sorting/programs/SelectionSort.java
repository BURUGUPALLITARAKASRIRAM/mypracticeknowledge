package com.sorting.programs;
public class SelectionSort {
	static void selectionSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex=j;
				}
				int temp =arr[minIndex];
				arr[minIndex]=arr[i];
				arr[i]=temp;
			}
		}
	}
	public static void main (String [] args) {
		int arr[]= {4,7,3,5,2};
		selectionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}	
	}
}
