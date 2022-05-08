package com.dailycode.rough;

import java.util.Arrays;

public class ZeroAtEnd {

	public static void main(String[] args) {
		int[] array = {0,8,0,4,5,2,0} ;
		arrangeArray(array);
	}

	private static void arrangeArray(int[] array) {
		
		for(int i=0;i<array.length;i++) {
			int j=i;
			while(j<array.length-1 && array[j]==0) {
				j++;
			}
			int tmp= array[i];
			array[i]=array[j];
			array[j]=tmp;
		}
		System.out.println(Arrays.toString(array));
	}

}
