package com.dailycode.rough;

import java.util.Arrays;

public class MinimumDifference {

	public static void main(String[] args) {
		int[] array = {1,98,67,74};
		System.out.println(findMinimumDifference(array));
	}

	private static int findMinimumDifference(int[] array) {
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int minDiff = Integer.MAX_VALUE;
		int len = array.length;
		for(int i=len-1;i>0;i--) {
			int del = array[i]-array[i-1];
			if(del<minDiff) minDiff=del;
		}
		return minDiff;
	}

}
