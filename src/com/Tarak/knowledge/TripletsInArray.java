package com.Tarak.knowledge;
public class TripletsInArray {
	public static void main(String[] args) {
		int [] arr = {0, -1, 2, -3, 1};
		for(int i=0;i<arr.length-2;i++) {
			for(int j =i+1;j<arr.length-1;j++) {
				for(int k =j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						System.out.println("Triplet found: " + arr[i] + ", " + arr[j] + ", " + arr[k]);             
					}
				}
			}
		}
	}
}
