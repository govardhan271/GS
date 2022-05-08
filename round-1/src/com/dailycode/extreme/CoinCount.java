package com.dailycode.extreme;

public class CoinCount {
	public static void main(String[] args) {
        int[] coins = { 10, 2, 5 };
        int[] frequency = { 5, 10, 50 };
        int target = 50;
        int sum = 0, count = 0;
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 10; j++) {
                for (int k = 0; k <= 50; k++) {
                    sum =(i * 10 + j * 2 + k * 5);
                    if (sum == target) {
                        count++;
                    }
                }
            }
        }
        System.out.println("Number of possibilities are: " + count);
    }
}