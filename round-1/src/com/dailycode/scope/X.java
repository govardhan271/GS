package com.dailycode.scope;

public class X implements Xin{
	private int x;
	public X(int x) {
		this.x=x;
	}
	public void x() {
		for(int x=1;x<=10;x++) {
			System.out.println(x+"*"+this.x+"="+x*this.x);
		}
	}

}
interface Xin{
	int value =100;	
}
