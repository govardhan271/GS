package com.dailycode.designPattern;

public class SingletonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc a = Abc.getObj();
		Abc b = Abc.getObj();
		System.out.println(a==b);
		new Thread(()->Abc.getObj()).start();
		new Thread(()->Abc.getObj()).start();
	}

}
class Abc{
	private static Abc obj;
	private Abc() {
		System.out.println(this.getClass().getSimpleName()+" called");
	}
	public static Abc getObj() {
		if(obj == null) {
			synchronized (Abc.class) {//Double Checked Locking
				if(obj==null) {
					obj= new Abc();
				}
			}
			
		}
		return obj;
	}
}
