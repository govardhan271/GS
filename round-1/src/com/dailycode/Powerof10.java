package com.dailycode;

public class Powerof10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = isPowerof10(34);
		System.out.println(result);

	}

	private static boolean isPowerof10(int num) {
	

		while(num>=10 && num%10==0) {
			num/=10;
		}
		return num==1?true:false;
	}

}
