package com.dailycode.math;

public class FractionAddition {

	public static void main(String[] args) {
		findAdditionofFraction(1,500,2,1500);
//		findAdditionofFraction(1,2,3,2);
//		findAdditionofFraction(1,3,3,9);
//		findAdditionofFraction(1,5,3,15);
//		findAdditionofFraction(3,500,7,800);
//		findAdditionofFraction(1,200,-8,900);

	}

	private static void findAdditionofFraction(int num1, int den1, int num2, int den2) {
		int den;
		int num;
		int min;
		int div=1;
		if(den1==den2) {
			den = den1;
			num = num1+num2;
		}else {
			den = den1*den2;
			num = (num1*den2)+(num2*den1);
		}
		System.out.println(num+"/"+den);
		min = Math.abs(Math.min(num, den));
		for(int i=min;i>=1;i--) {
			if(num%i==0&den%i==0) {
				div =i;
				break;
			}

		}
		System.out.println(num/div+"/"+den/div);
		
	}

}
