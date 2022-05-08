package com.dailycode.math;

import java.util.ArrayList;
import java.util.List;

public class TargetSum {

	public static void main(String[] args) {
		int[] inputArray = {12,7,29,6, 3, 11,4,9};
		int sum = 9;
		findTargetSum(inputArray,sum);

	}

	private static void findTargetSum(int[] inputArray, int target) {
		List<Integer>subList;
		List<List<Integer>>list = new ArrayList<>();
		for(int i=0;i<inputArray.length;i++) {
			int sum =0;
			subList= new ArrayList<>();
			for(int j=i;j<inputArray.length;j++) {
				sum+=inputArray[j];
				if(sum<target) {
					subList.add(j);
				}else if(sum==target) {
					subList.add(j);
					list.add(subList);
				}else {
					break;
				}

			}

		}
		System.out.println(list);

	}

}
