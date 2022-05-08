package com.dailycode.string;

public class MaxCharIndexCount {

	public static void main(String[] args) {
		System.out.println(findRunLength("aabc"));
	}
	private static String findRunLength(String string) {
		String res="";
		int pos =0;
		int index=0;
		int maxCount =1;
		int len = string.length();
		for(int i=0;i<len;i++) {
			int count =1;
			pos =i;
			while(i<len-1 && string.charAt(i)==string.charAt(i+1)) {
				count++;	
				i++;
				if(count>maxCount) {
					maxCount = count;
					index = pos;
				}
			}
			res+=string.charAt(i)+String.format("%d", count);
		}
		System.out.println("MaxCount is "+maxCount+" at index "+index+" and the character is "+string.charAt(index));
		return res;

	}

}
