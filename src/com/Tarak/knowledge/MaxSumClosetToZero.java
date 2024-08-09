package com.Tarak.knowledge;
import java.util.Arrays;
public class MaxSumClosetToZero {
	public static int maxSumClosetToZero(int [] arr) {
		int n =arr.length;
		Arrays.sort(arr);
		int left =0;
		int right =n-1;
		int minSum = Integer.MAX_VALUE;
		int maxSum = Integer.MIN_VALUE;
		while(left<right) {
			int sum =arr[left]+arr[right];
			if(Math.abs(sum)<Math.abs(minSum)) {
				maxSum=sum;
				minSum=sum;
			}else if(Math.abs(sum) == Math.abs(minSum)) {
                maxSum = Math.max(maxSum, sum);
			}
			if (sum < 0) {
                left++;
            } else {
                right--;
            }
        } 
        return maxSum;
		}
	public static void main(String[] args) {
        int[] arr = {-21 ,-67, -37, -18, 4, -65};
        int result = maxSumClosetToZero(arr);
        System.out.println("Maximum sum closest to zero: " + result);
    }
	}
