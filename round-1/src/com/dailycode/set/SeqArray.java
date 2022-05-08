package com.dailycode.set;

import java.util.LinkedHashMap;
import java.util.Map;

public class SeqArray {

	public static void main(String[] args) {
		String seq = "bba" ; 
		String[] arr={"cat", "cat", "dog"};
		System.out.println(checkSequence(seq,arr));

	}
	private static boolean checkSequence(String string, String[] arr) {
		Map<String,Character> map = new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				if(map.get(arr[i]) != string.charAt(i)) {
					return false;
				}

			}else {
				map.put(arr[i], string.charAt(i));
			}
		}
		System.out.println(map);
		return true;

	}

}
