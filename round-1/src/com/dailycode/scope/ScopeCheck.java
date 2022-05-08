package com.dailycode.scope;

public class ScopeCheck {
	int privateVar=3;
	public void multiply() {
		int privateVar = 2;
		for(int i=0;i<=10;i++) {
			System.out.println(i+"*"+this.privateVar+"="+i*this.privateVar);
		}
	}
	public class InnerClass{
		int privateVar=6;
		public void multiply() {
			int privateVar = 5;
			for(int i=0;i<=10;i++) {
				System.out.println(i+"*"+ScopeCheck.this.privateVar+"="+i*ScopeCheck.this.privateVar);
			}
		}
	}

}
