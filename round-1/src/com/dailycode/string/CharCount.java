package com.dailycode.string;


public class CharCount {

	public static void main(String[] args) {
		System.out.println(findCharCount("aabbccaaad"));

	}
	private static String findCharCount(String string) {
		String res ="";
		char[] charArray = string.toCharArray();
		int[] frequency = new int[charArray.length];
		for(int i=0;i<charArray.length;i++) {
			int count =1;
			for(int j=i+1;j<charArray.length;j++) {
				if(charArray[i]==charArray[j]) {
					count++;
					charArray[j]='0';
				}
			}
			frequency[i]=count;
		}
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]!='0') {
				res+=charArray[i]+String.format("%d", frequency[i]);
			}
		}

		return res;
	}

}
