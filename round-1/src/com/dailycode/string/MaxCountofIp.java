package com.dailycode.string;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxCountofIp {

	public static void main(String[] args) {
		String lines[] = {"123.123.123.124 - - [26/Apr/2000:00:23:48 -0400]",
				"123.123.123.124 - - [26/Apr/2000:00:23:48 -0400]",
		"123.123.123.123 - - [26/Apr/2000:00:23:48 -0400]"};

		String result = findMaxRepeatedIp(lines);
		System.out.println(result);
	}

	private static String findMaxRepeatedIp(String[] lines) {
		Map<String, Integer> map = new HashMap<>();	
		int max;
		for(String line:lines) {
			String ip = line.split("-")[0].trim();
			if(map.containsKey(ip)) {
				map.put(ip, map.get(ip)+1);
			}else {
				map.put(ip, 1);
			}
		}
		max = Collections.max(map.values());
		for(Map.Entry<String, Integer>entry:map.entrySet()) {
			if(entry.getValue()==max) {
				return entry.getKey();
			}
		}

		return null;
	}

}
