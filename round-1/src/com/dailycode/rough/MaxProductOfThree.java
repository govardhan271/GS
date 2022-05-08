package com.dailycode.rough;

public class MaxProductOfThree {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		findMaxProductOfThree(array);			
	}

	private static void findMaxProductOfThree(int[] array) {

		int maxProduct =array[0]*array[1]*array[2];
		int index = 0;
		for(int i=0;i<array.length-2;i++) {;
			int product = 1;
			for(int j=i;j<i+3;j++) {
				product*=array[j];
			}
			if(product>maxProduct) {
				maxProduct = product;
				index = i;
			}
		}
		System.out.println(maxProduct+" starts from index "+ index);
	}

}
