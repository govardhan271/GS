package com.dailycode.set;

public class ConcatinatedMaxNumber {

	public static void main(String[] args) {
		int[] array = {12,76,89,65};
		String result = findConcatinatedMaxValue(array);
		System.out.println(result);
	}

	private static String findConcatinatedMaxValue(int[] array) {
		int index =-1;
		int max =-1;
		String res = "";
		for(int i=0;i<array.length;i++) {
			int num = array[i];
			while(num>0) {
				int r = num%10;
				num /=10;
				if(num == 0) {
					if(max <r) {
						max =r;
						index =i;
					}

				}
			}
		}
		for(int i=index;i<array.length;i++) {
			res+=array[i];
		}
		for(int i=0;i<index;i++) {
			res+=array[i];
		}

		return res;
	}
}
