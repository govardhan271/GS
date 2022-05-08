package com.dailycode.string;

public class ReverseStringInOrder {

	public static void main(String[] args) {
		String string = "I am a Java Developer";
		String result = usingSB(string);
		System.out.println(result);
	}
	
	private static String usingSB(String string) {
		String dupString = string.replace(" ","");
		StringBuffer sb = new StringBuffer(dupString);
		sb.reverse();
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)==' ') {
				sb.insert(i, string.charAt(i));
			}
		}
		return new String(sb);
	}
}
