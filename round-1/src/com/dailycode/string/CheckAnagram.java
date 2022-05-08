package com.dailycode.string;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "silents";
		String string2 = "listens";
		System.out.println(checkAnangram(string1,string2));

	}

	private static boolean checkAnangram(String string1, String string2) {
		char[] cr1 = string1.toCharArray();
		char[] cr2 = string2.toCharArray();
		Arrays.sort(cr1);
		Arrays.sort(cr2);
		String res1 = new String(cr1);
		String res2 = new String(cr2);
		
		return res1.equals(res2);
	}

}
