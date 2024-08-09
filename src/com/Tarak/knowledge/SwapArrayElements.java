package com.Tarak.knowledge;
import java.util.Arrays;
public class SwapArrayElements {
	public static int swapArray(int arr[]) {
		int temp=0;
		System.out.println("Before Swaping :" + Arrays.toString(arr));
		for(int i=0;i<arr.length-2;i++) {
			System.out.println("after loop :"+ i);
			System.out.println("temp is using :" + (temp=arr[i]));
			System.out.println("after adding :" + (arr[i]=arr[i+2]));
			System.out.println("after :" + (arr[i+2]=temp));
		}
		System.out.println( "After Swaping :" +  Arrays.toString(arr));
		return 0;
	}
	//////////////////////////////////////////////////////////////////////
	public static void swapArray1() {
		int [] arr= {5,4,1,2,3};
		
		for(int i=0; i<arr.length-2;i++) {
			int temp=0;
			temp=arr[i];
			arr[i]=arr[i+2];
			arr[i+2]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	//////////////////////////////////////////////////
	public static void main(String [] args) {
		int [] arr= {1,5,7,3,4};
		int result =swapArray(arr);	
		System.out.println();
		swapArray1();
	}
}
