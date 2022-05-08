package com.dailycode.rough;

public class MaxSubArraySum {

	public static void main(String[] args) {
		int[] array = {-2,-1,-3,4,-1,2,1,-5,4};
		System.out.println(findMaxSubArraySum(array));
	}

	private static int findMaxSubArraySum(int[] array) {
		int maxSum = array[0];
		int sum = 0;	
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
			if(sum>maxSum) {
				maxSum=sum;
			}else if(sum<0) {
				sum=0;
			}
		}
		
		return maxSum;
	}

}
