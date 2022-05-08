package com.dailycode.dynamic;

public class RainWater {

	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		int result = findWaterTrapped(arr);
		System.out.println(result);
	}

	private static int findWaterTrapped(int[] arr) {
		int waterTrapped = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			int leftHighest = arr[i];
			for(int j=0;j<i;j++) {
				leftHighest = Math.max(arr[j], leftHighest);
			}
			
			int rightHighest = arr[i];
			for(int k=i+1;k<arr.length;k++) {
				rightHighest = Math.max(rightHighest, arr[k]);
			}
			waterTrapped += Math.min(leftHighest, rightHighest)-arr[i];
		}
		
		return waterTrapped;
	}

}
