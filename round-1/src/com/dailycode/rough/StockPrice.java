package com.dailycode.rough;

public class StockPrice {

	public static void main(String[] args) {
		int[] stock = {7,1,5,3,6,4};
		int[] stock2 = {7,6,4,3,1};
		System.out.println(findMaxProfit(stock));
		System.out.println(findMaxProfit(stock2));
	}

	private static int findMaxProfit(int[] stock) {
		int minPrice = Integer.MAX_VALUE;
		int maxPrice = Integer.MIN_VALUE;
		int minPriceIndex = 0;
		for(int i=0;i<stock.length;i++) {
			if(stock[i]<minPrice) {
				minPrice=stock[i];
				minPriceIndex = i;
			}
		}
		for(int i=minPriceIndex;i<stock.length;i++) {
			if(stock[i]>maxPrice) {
				maxPrice= stock[i];
			}
		}
		
		return maxPrice-minPrice>0?maxPrice-minPrice:0;
	}
	

}
