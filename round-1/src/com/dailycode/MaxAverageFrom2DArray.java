package com.dailycode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxAverageFrom2DArray {

	public static void main(String[] args) {
		String[][] scores = { { "Rohit", "85" }, { "Rahul", "80" },
				{ "Rahul", "99" }, { "Amit", "100" }, { "Rohit", "90" }};
		int result = findMaxAverage(scores);
		System.out.println(result);
	}

	private static int findMaxAverage(String[][] scores) {	
		List<Integer>list;
		int highestAverage = 0;
		Map<String,List<Integer>> map = new HashMap<>();
		for(int i=0;i<scores.length;i++) {
			if(map.containsKey(scores[i][0])) {
				map.get(scores[i][0]).add(Integer.valueOf(scores[i][1]));
			}else {
				list = new ArrayList<>();
				list.add(Integer.valueOf(scores[i][1]));
				map.put(scores[i][0], list);
			}
		}
		
		System.out.println(map);
		
		for(Map.Entry<String,List<Integer>>entry:map.entrySet()) {
			int average = findAverage(entry.getValue());
			if(average>highestAverage) {
				highestAverage = average;
			}
		}
		return highestAverage;
	}

	private static int findAverage(List<Integer> marks) {
		int sum = 0;
		for(int mark:marks) {
			sum+=mark;
		}
		return sum/marks.size();
	}

}
