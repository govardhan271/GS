package com.dailycode.rough;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] array = {1,7,9,8,6,8,6,1,3,3,1};
		removeDuplicates(array);
		//System.out.println(charCount("apple",'p'));

	}

	private static void removeDuplicates(int[] array) {
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		for(int i=1;i<array.length;i++) {
			if(array[i-1]==array[i]) {
				continue;
			}
			System.out.println(array[i]);
			
		}
			
		}
	private static int charCount(String str, char key) {
		int count =1;
		for(int i=str.indexOf(key)+1;i<str.length();i++) {
			if(str.charAt(i)==key) {
				count++;
			}
		}
		return count;
	}

}
