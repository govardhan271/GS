package com.dailycode;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		//		char c1 = findFirstNonRepeatedChar("apple");
		//		System.out.println(c1);
		//		char c2 = findFirstNonRepeatedChar("array");
		//		System.out.println(c2);
		//		char c3 = findFirstNonRepeatedChar("rat");
		//		System.out.println(c3);
		fnrc("rat");

	}

	private static char findFirstNonRepeatedChar(String string) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(char c: string.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);				
			}else {
				map.put(c, 1);
			}
		}
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}

		return '0';
	}
	private static char fnrc(String string) {
		for(char c: string.toCharArray()) {
			if(string.indexOf(c)==string.lastIndexOf(c)) {
				return c;
			}
		}
		return '0';
	}

}
