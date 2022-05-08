package com.dailycode.scope;

public class Main {

	public static void main(String[] args) {
//		ScopeCheck sc = new ScopeCheck();
//		sc.multiply();
//		System.out.println("========>");
//		ScopeCheck.InnerClass sic = sc.new InnerClass();
//		sic.multiply();
		X x = new X(5);
		x.x();
		System.out.println(x.value);
		
	}

}
