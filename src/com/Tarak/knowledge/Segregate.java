package com.Tarak.knowledge;
import java.util.Arrays;
public class Segregate {
	static void segregate0And1s(int arr[],int n) {
		int count =0;
		int count1=0;
		int count2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count++;
			}else if(arr[i]==1) {
				count1++;
			}else {
				count2++;
			}
		}
		for(int i=0;i<count;i++) {
			arr[i]=0;
		}
		int one =count+count1;
		for(int i=count;i<one;i++) {
			arr[i]=1;
		}
		int two =one+count2;
		for(int i=one;i<two;i++) {
			arr[i]=2;
		}
	}
	public static void  print(int[] arr, int n) {
		System.out.println("After segregation:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args)                                              
    {                                                                                   
        int arr[] = new int[]{0,1,2,1,1,0,2};
        int n = arr.length;                                                            
        segregate0And1s(arr, n);       
        print(arr, n);                                                                                                                                                                                                                                                                                                           
}                                                                                                                     
}
