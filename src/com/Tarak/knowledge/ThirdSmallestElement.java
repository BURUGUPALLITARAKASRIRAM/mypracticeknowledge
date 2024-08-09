package com.Tarak.knowledge;
public class ThirdSmallestElement {
	public static void thirdSmallest() {
	int arr[] = { 7, 10, 4, 3, 20, 15};
	int fMin = Integer.MAX_VALUE;
	int sMin = Integer.MAX_VALUE;
	int tMin = Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(fMin>arr[i]) {
			tMin=sMin;
			sMin=fMin;
			fMin=arr[i];
		}else if(sMin>arr[i]) {
			sMin=arr[i];
		}else if(tMin>arr[i]){
			tMin=arr[i];
		}
	}
	System.out.println(sMin);
	}
	public static void main(String[] args) {
		thirdSmallest();
		
	}
}
