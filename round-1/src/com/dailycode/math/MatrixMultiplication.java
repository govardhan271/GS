package com.dailycode.math;

import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int A[][] = { { 1, 1, 1 },
				{ 2, 2,4 },
				{ 3, 3,5 },
				{ 4, 4,9 } };

		int B[][] = { { 1, 1, 1, 1 },
				{ 2, 2, 2, 2 },
				{ 3, 3, 3, 3 } };

		productOfMatrices(A,B);

	}

	private static void productOfMatrices(int[][] A, int[][] B) {
		int r1=A.length;
		int c1 = A[0].length;
		int r2 = B.length;
		int c2 = B[0].length;
		int[][] res = new int[r1][c2];;
		if(r2!=c1) {
			System.out.println("Matrix multiplication is not possible");
		}else {
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c2;j++) {
					for(int k=0;k<c1;k++) {
						res[i][j] += A[i][k]*B[k][j];
					}
				}
			}
			
		}
		System.out.println(Arrays.toString(res[3]));

	}

}
