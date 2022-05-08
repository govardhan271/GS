package com.dailycode.rough;

public class Robbery {

	public static void main(String[] args) {
		int[] array = {2,7,9,3,1,1};
		System.out.println(findMaxRobbedAmount(array));
	}
	private static int findMaxRobbedAmount(int[] array) {
		int evenSum=0;
		int oddSum=0;		
		for(int i=0;i<array.length;i++) {
			if(i%2==0) {
				evenSum+=array[i];
			}else {
				oddSum+=array[i];
			}
		}
		return evenSum>oddSum?evenSum:oddSum;
	}

}
