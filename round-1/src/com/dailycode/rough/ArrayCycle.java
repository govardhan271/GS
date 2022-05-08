package com.dailycode.rough;

import java.util.ArrayList;
import java.util.List;

public class ArrayCycle {

	public static void main(String[] args) {
		int[] array = {1,3,0,2};
		int startIndex= 0;
		System.out.println(findCyclicArraySize(array,startIndex));
	}
	private static int findCyclicArraySize(int[] array, int startIndex) {
		int i = startIndex;
		List<Integer>list=new ArrayList<>();
		while(i<array.length) {
			if(list.contains(i)) {
				return list.size()-list.indexOf(Integer.valueOf(i));
			}else {
				list.add(i);
			}
			i=array[i];
		}
		System.out.println(list);
		return -1;
	}
}