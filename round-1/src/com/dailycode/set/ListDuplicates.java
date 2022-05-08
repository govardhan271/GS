package com.dailycode.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListDuplicates {

	public static void main(String[] args) {
		int[][] array =  {{4, 5}, {6, 1}, {4, 5}, {6, 1}};
		List<Integer>subList;
		List<List<Integer>> list = new ArrayList<>();
		Set<List<Integer>> set;
		for(int[] arr:array) {
			subList = new ArrayList<>();
			for(int j:arr) {
				subList.add(j);
			}
			list.add(subList);
		}
		set = new LinkedHashSet<>(list);
		System.out.println(set);
	}

}
