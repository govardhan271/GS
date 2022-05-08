package com.dailycode.dynamic;

public class NewtonRaphson {

	public static void main(String[] args) {
		  /*
	       * Find the Square root using Newton raphson method
	Given number = N
	Make an initial guess
	Update the guess using below formula
	New Estimate = Current Estimate - (F(Current Estimate) / F'(Current Estimate))
	where F(Current Estimate) = Current Estimate * Current Estimate -N
	F'(Current Estimate) = 2 * Current Estimate
	       */
		double result = findSqrt(327);
		System.out.println(result);

	}

	private static double findSqrt(double num) {
		double x = num;
		double root;
		while(true) {
			root = x- ((x*x-num)/(2*x));
			if(Math.abs(root-x)<0.000001) {
				break;
			}
			x=root;		
		}
		return root;
	}

}
