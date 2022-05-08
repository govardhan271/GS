package com.dailycode;

public class SortedArraysMedian {

	public static void main(String[] args) {
		int[] arr1 = {1,2,6};
		int[] arr2 = {3,4,5,7};
		double result = findMedain(arr1,arr2);
		System.out.println(result);
	}

	private static double findMedain(int[] arr1, int[] arr2) {
		int arr1Len=arr1.length;
		int arr2Len=arr2.length;
		int len = arr1Len+arr2Len;
		int medianIndex = len/2;
		int[] sortedArray = new int[len];
		int i=0,j=0,k=0;
		while(i<arr1Len&&j<arr2Len) {
			if(arr1[i]<arr2[j]) {
				sortedArray[k]=arr1[i];
				i++;
			}else {
				sortedArray[k]=arr2[j];
				j++;
			}
			k++;
		}
		while(i<arr1Len) {
			sortedArray[k]=arr1[i];
			i++;
			k++;
			
		}
		while(j<arr2Len) {
			sortedArray[k]=arr2[j];
			j++;
			k++;
			
		}
		if(len%2!=0) {
			double res =  sortedArray[medianIndex];
			return res;
		}else {
			double res =(sortedArray[medianIndex]+sortedArray[medianIndex-1]);
			return res/2;
		}
		
	}

}
